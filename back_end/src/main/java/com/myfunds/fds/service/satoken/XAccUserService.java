package com.myfunds.fds.service.satoken;


import cn.dev33.satoken.spring.SpringMVCUtil;
import cn.dev33.satoken.stp.StpUtil;
import com.myfunds.fds.config.SystemObject;
import com.myfunds.fds.entity.satoken.XUser;
import com.myfunds.fds.mapper.satoken.XAccUserMapper;
import com.myfunds.fds.mapper.satoken.XUserMapper;
import com.myfunds.fds.util.sg.AjaxJson;
import com.myfunds.fds.util.sg.NbUtil;
import com.myfunds.fds.util.sg.WebNbUtil;
import com.myfunds.fds.util.so.SoMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.Set;

/**
 * service：XUser账号相关
 * @author jbk-xiao
 *
 */
@Slf4j
@Service
public class XAccUserService {
	private final XAccUserMapper xAccUserMapper;

	private final XUserMapper xUserMapper;
	
	private final XRolePermissionService xRolePermissionService;

	public XAccUserService(XAccUserMapper xAccUserMapper, XUserMapper xUserMapper, XRolePermissionService xRolePermissionService) {
		this.xAccUserMapper = xAccUserMapper;
		this.xUserMapper = xUserMapper;
		this.xRolePermissionService = xRolePermissionService;
	}

	public String registerManager(String name, String password, String mail, String org) {
		Set<String> ids = this.xUserMapper.getIdSet();
		log.info("idList: {}", ids.toString());
		String userId;
		do {
			userId = "1" + (int) (Math.random() * 100000);
		} while (ids.contains(userId));
		String sPassword = SystemObject.getPasswordMd5(userId, password);

		try {
			this.xUserMapper.add(userId, name, 1, sPassword, password);
		} catch (Exception e) {
			log.error(e.toString());
			return "";
		}
		return userId;
	}

	/**
	  * 登录 
	 * @param id 用户ID
	 * @param password 用户密码
	 * @param httpServletResponse
	 * @return
	 */
	public AjaxJson doLogin(String id, String password, HttpServletResponse httpServletResponse) {
		
		// 0、判断 way (1=ID, 2=昵称，3=邮箱)
    	int way = 2;	
    	if (NbUtil.isNumber(id)){
    		way = 1;
    	}
    	if (NbUtil.isEmail(id)) {
    		way = 3;
		}
		
		// 2、获取admin
        XUser xUser = null;
        if(way == 1) {
        	xUser = xUserMapper.getById(id);
        }
        if(way == 2) {
        	xUser = xUserMapper.getByName(id);
        }
        if(way == 3) {
        	xUser = xUserMapper.getByMail(id);
        }
        

        // 3、开始验证
        if(xUser == null){
        	return AjaxJson.getError("无此账号");
        }
        if(NbUtil.isNull(xUser.getPassword2())) {
        	return AjaxJson.getError("此账号尚未设置密码，无法登陆");
        }
        String md5Password = SystemObject.getPasswordMd5(xUser.getId(), password);
        if(!xUser.getPassword2().equals(md5Password)){
        	return AjaxJson.getError("密码错误");
        }
        
        // 4、是否禁用
        if(xUser.getStatus() == 2) {
        	return AjaxJson.getError("此账号已被禁用，如有疑问，请联系管理员");	
        }

        // =========== 至此, 已登录成功 ============ 
        successLogin(xUser);
        StpUtil.setLoginId(xUser.getId());
        
        // 组织返回参数  
		SoMap map = new SoMap();
		map.put("xUser", xUser);
		map.put("per_list", xRolePermissionService.getPcodeByRid2(xUser.getRoleId()));
		map.put("tokenInfo", StpUtil.getTokenInfo());
		return AjaxJson.getSuccessData(map);	
	}
	
	
	/**
	 * 指定id的账号成功登录一次 （修改最后登录时间等数据 ）
	 * @param xUser
	 * @return
	 */
	public int successLogin(XUser xUser){
		String loginIp = WebNbUtil.getIP(SpringMVCUtil.getRequest());
		int line = xAccUserMapper.successLogin(xUser.getId(), loginIp);
		if(line > 0) {
	        xUser.setLoginIp(loginIp);
	        xUser.setLoginTime(new Timestamp(System.currentTimeMillis()));
	        xUser.setLoginCount(xUser.getLoginCount() + 1);
		}
        return line;
	}
}
