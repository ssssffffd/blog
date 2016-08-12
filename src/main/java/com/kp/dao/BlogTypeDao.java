package com.kp.dao;

import java.util.List;
import java.util.Map;

import com.kp.entity.BlogType;

/**
 * 博客类型Dao接口
 */
public interface BlogTypeDao {

	/**
	 * 查询所有博客类型及数量
	 */
	public List<BlogType> countList();
	
	/**
	 * 通过Id查询博客类型
	 */
	public BlogType findById(Integer id);
	
	/**
	 * 分页查询博客类别信息
	 */
	public List<BlogType> list(Map<String, Object> map);
	
	/**
	 * 获取总记录数
	 */
	public Long getTotal(Map<String, Object> map);
	
	/**
	 * 添加博客类别
	 */
	public Integer add(BlogType blogType);
	
	/**
	 * 更新博客类别
	 */
	public Integer update(BlogType blogType);
	
	/**
	 * 删除博客类别
	 */
	public Integer delete(Integer id);
}
