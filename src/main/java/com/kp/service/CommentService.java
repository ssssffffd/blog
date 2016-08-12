package com.kp.service;

import java.util.List;
import java.util.Map;

import com.kp.entity.Comment;

/**
 * 评论的服务层接口
 */
public interface CommentService {

	/**
	 * 添加评论
	 */
	public int add(Comment comment);
	
	/**
	 * 修改评论
	 */
	public int update(Comment comment);
	
	/**
	 * 查找用户评论
	 */
	public List<Comment> list(Map<String, Object> map);
	
	
	/**
	 * 获取总记录数
	 */
	public Long getTotal(Map<String, Object> map);
	
	/**
	 * 根据Id删除评论
	 */
	public Integer delete(Integer id);
}
