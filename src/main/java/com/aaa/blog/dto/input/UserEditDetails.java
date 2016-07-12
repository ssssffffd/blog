package com.aaa.blog.dto.input;

import com.aaa.blog.dao.User;

import java.util.List;

/**
 *
 * @Description: 新增、修改会员信息详情
 */

public class UserEditDetails  {
	private User user;
	/**
	 * 会员角色信息
	 */
	private String roleIds;

	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	
}
