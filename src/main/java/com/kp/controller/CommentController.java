package com.kp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kp.entity.Blog;
import com.kp.entity.Comment;
import com.kp.service.BlogService;
import com.kp.service.CommentService;
import com.kp.util.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.sf.json.JSONObject;

/**
 * 评论
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Resource
	private CommentService commentService;
	
	@Resource
	private BlogService blogService;
	
	/**
	 * 添加或修改评论
	 */
	@RequestMapping("/save")
	public String save(Comment comment,@RequestParam("imageCode") String imageCode,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		String sRand=(String) session.getAttribute("sRand"); // 获取系统生成的验证码
		JSONObject result=new JSONObject();
		int resultTotal=0; // 操作的记录条数
		if(!imageCode.equals(sRand)){
			result.put("success", false);
			result.put("errorInfo", "验证码填写错误");
		}else{
			String userIp=request.getRemoteAddr(); //获取用户Ip
			comment.setUserIp(userIp);
			if(comment.getId()==null){
				resultTotal=commentService.add(comment);
				// 该博客回复次数+1
				Blog blog=blogService.findById(comment.getBlog().getId());
				blog.setReplyHit(blog.getReplyHit()+1);
				blogService.update(blog);
			}else{
				
			}
			if(resultTotal>0){
				result.put("success", true);
			}else{
				result.put("success", false);
			}
		}
		ResponseUtil.write(response, result);
		return null;
	}

}
