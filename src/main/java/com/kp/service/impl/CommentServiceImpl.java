package com.kp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.kp.dao.CommentDao;
import com.kp.entity.Comment;
import com.kp.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * 评论服务层实现类
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Resource
	private CommentDao commentDao;
	
	public int add(Comment comment) {
		return commentDao.add(comment);
	}

	public List<Comment> list(Map<String, Object> map) {
		return commentDao.list(map);
	}

	public Long getTotal(Map<String, Object> map) {
		return commentDao.getTotal(map);
	}

	public Integer delete(Integer id) {
		return commentDao.delete(id);
	}

	public int update(Comment comment) {
		return commentDao.update(comment);
	}

}
