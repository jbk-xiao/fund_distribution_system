package com.myfunds.fds.mapper.satoken;

import com.myfunds.fds.entity.satoken.XUser;
import com.myfunds.fds.util.so.SoMap;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Set;

/**
 * Mapper: 系统管理员表
 * @author jbk-xiao
 */
@Mapper
public interface XUserMapper {
	
	/**
	 * 增 #{name}, #{password}, #{roleId} 
	 *
	 * @return
	 */
	int add(String userId, String name, int roleId, String password, String pw);

	/**
	 * 查询所有已存在Id
	 * @return
	 */
	Set<String> getIdSet();
	/**
	 * 删 
	 * @param id
	 * @return
	 */
	int delete(String id);

	/**
	 * 改 
	 */
//	int update(XUser obj);
	int update(String userId, String name, String password, String pw);
	int updatePassword(String userId, String password, String pw);
	/**
	 * 查 
	 * @param id 用户ID
	 * @return
	 */
	XUser getById(String id);

	/**
	 * 查  
	 * @param so
	 * @return
	 */
	List<XUser> getList(SoMap so);

	/**
	 * 查询，根据name 
	 * @param name
	 * @return
	 */
	XUser getByName(String name);
	
	/**
	 * 查询，根据 mail
	 * @param mail
	 * @return
	 */
	XUser getByMail(String mail);

	/**
	 * 查询所有
	 */
	List<XUser> getAll();

	int updatePasswordAndMail(String userId, String password, String pw, String mail);
}
