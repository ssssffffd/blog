package com.kp.dao;

import java.util.List;
import java.util.Map;

import com.kp.entity.Comment;

/**
 * 评论Dao接口
 */
public interface CommentDao {

	/**
	 * 添加评论
	 */
	public int add(Comment comment);
	
	/**
	 * 修改评论
	 */
	public int update(Comment comment);
	
	/**
	 * 查找用户评论信息
	 */
	public List<Comment> list(Map<String, Object> map);
	
	/**
	 * 获取总记录数
	 */
	public Long getTotal(Map<String, Object> map);
	
	/**
	 * 删除评论
	 */
	public Integer delete(Integer id);
	
	
}
