package com.kp.dao;

import java.util.List;
import java.util.Map;

import com.kp.entity.Blog;

/**
 * 博客Dao接口
 */
public interface BlogDao {

	/**
	 * 根据日期月份分组查询
	 */
	public List<Blog> countList();
	
	/**
	 * 分页查询博客
	 */
	public List<Blog> list(Map<String, Object> map);
	
	/**
	 * 获取棕记录数
	 */
	public Long getTotal(Map<String, Object> map);
	
	/**
	 * 通过Id查询博客
	 */
	public Blog findById(Integer id);
	
	/**
	 * 更新博客
	 */
	public Integer update(Blog blog); 
	
	/**
	 * 获取上一个博客
	 */
	public Blog getLastBlog(Integer id);
	
	/**
	 * 获取下一个博客
	 */
	public Blog getNextBlog(Integer id);
	
	/**
	 * 添加博客
	 */
	public Integer add(Blog blog);
	
	/**
	 * 删除博客
	 */
	public Integer delete(Integer id);
	
	
}
