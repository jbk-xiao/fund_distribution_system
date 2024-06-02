package com.myfunds.fds.entity.satoken;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Model: 系统管理员表
 * @author jbk-xiao
 */
@Data
public class XUser implements Serializable  {

	private static final long serialVersionUID = 1L;


	/** id，--主键 */
	public String id;
	
	/** admin名称 */
	public String name;	

	
	/** 密码 */
	public String password;	
	
	/** 明文密码 */
	@JsonIgnore()
	public String pw;
	
	/** 所属角色id */
	public Integer roleId;	
	
	/** 账号状态(1=正常, 2=禁用) */
	public Integer status;
	
	/** 创建时间 */
	public Timestamp createTime;
	
	/** 上次登陆时间 */
	public Timestamp loginTime;
	
	/** 上次登陆IP */
	public String loginIp;	
	
	/** 登陆次数 */
	public Integer loginCount;

	/** 所属角色名称   */
	private String roleName;

	/** 防止密码被传递到前台  */
    public String getPassword(){
    	return "********";
    }
    /** 获取真实密码   */
    @JsonIgnore()
    public String getPassword2(){
    	return this.password;
    }
	
}
