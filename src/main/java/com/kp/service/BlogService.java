package com.kp.service;

import java.util.List;
import java.util.Map;

import com.kp.entity.Blog;

/**
 * 博客的服务层接口
 */
public interface BlogService {

	/**
	 * 根据年月分组查询
	 */
	public List<Blog> countList();
	
	/**
	 * 分页查询博客
	 */
	public List<Blog> list(Map<String, Object> map);
	
	/**
	 * 获取总记录数
	 */
	public Long getTotal(Map<String, Object> map);
	
	/**
	 * 通过Id查找博客
	 */
	public Blog findById(Integer id);
	
	/**
	 * 更新博客信息
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
	 * 根据Id删除博客
	 */
	public Integer delete(Integer id);
}
