package com.kp.service;

import java.util.List;
import java.util.Map;

import com.kp.entity.BlogType;

/**
 * 博客类型的服务层接口
 */
public interface BlogTypeService {

	/**
	 * 查询所有博客类型及其数量
	 */
	public List<BlogType> countList();
	
	/**
	 * 分页查询博客类别信息
	 */
	public List<BlogType> list(Map<String, Object> map);
	
	/**
	 * 获取总记录数
	 */
	public Long getTotal(Map<String, Object> map);
	
	/**
	 * 添加博客类型
	 */
	public Integer add(BlogType blogType);
	
	/**
	 * 修改博客类型
	 */
	public Integer update(BlogType blogType);
	
	/**
	 * 删除博客类型
	 */
	public Integer delete(Integer id);
}
