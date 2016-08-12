package com.kp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.kp.dao.BlogTypeDao;
import com.kp.entity.BlogType;
import com.kp.service.BlogTypeService;
import org.springframework.stereotype.Service;

/**
 * 博主类型服务层实现类
 */
@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {

	@Resource
	private BlogTypeDao blogTypeDao;
	
	public List<BlogType> countList() {
		return blogTypeDao.countList();
	}

	public List<BlogType> list(Map<String, Object> map) {
		return blogTypeDao.list(map);
	}

	public Long getTotal(Map<String, Object> map) {
		return blogTypeDao.getTotal(map);
	}

	public Integer add(BlogType blogType) {
		return blogTypeDao.add(blogType);
	}

	public Integer update(BlogType blogType) {
		return blogTypeDao.update(blogType);
	}

	public Integer delete(Integer id) {
		return blogTypeDao.delete(id);
	}

}
