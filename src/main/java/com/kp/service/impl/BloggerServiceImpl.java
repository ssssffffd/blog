package com.kp.service.impl;

import javax.annotation.Resource;

import com.kp.dao.BloggerDao;
import org.springframework.stereotype.Service;

import com.kp.entity.Blogger;
import com.kp.service.BloggerService;

/**
 * 博主服务层实现类
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{

	@Resource
	private BloggerDao bloggerDao;

	public Blogger find() {
		return bloggerDao.find();
	}

	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}

	public Integer update(Blogger blogger) {
		return bloggerDao.update(blogger);
	}
	
	
}
