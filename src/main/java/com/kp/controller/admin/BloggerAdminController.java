package com.kp.controller.admin;

import java.io.File;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kp.entity.Blogger;
import com.kp.service.BloggerService;
import com.kp.util.CryptographyUtil;
import com.kp.util.ResponseUtil;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kp.util.DateUtil;

import net.sf.json.JSONObject;

/**
 * 管理员 博主
 */
@Controller
@RequestMapping("/admin/blogger")
public class BloggerAdminController {

	@Resource
	private BloggerService bloggerService;
	
	/**
	 * 修改博主信息
	 */
	@RequestMapping("/save")
	public String save(@RequestParam("imageFile") MultipartFile imageFile,Blogger blogger,HttpServletRequest request,HttpServletResponse response)throws Exception{
		if(!imageFile.isEmpty()){
			String filePath=request.getServletContext().getRealPath("/");
			String imageName=DateUtil.getCurrentDateStr()+"."+imageFile.getOriginalFilename().split("\\.")[1];
			imageFile.transferTo(new File(filePath+"static/userImages/"+imageName));
			blogger.setImageName(imageName);
		}
		int resultTotal=bloggerService.update(blogger);
		StringBuffer result=new StringBuffer();
		if(resultTotal>0){
			result.append("<script language='javascript'>alert('修改成功');</script>");
		}else{
			result.append("<script language='javascript'>alert('修改失败');</script>");
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 查询博主信息
	 */
	@RequestMapping("/find")
	public String find(HttpServletResponse response)throws Exception{
		Blogger blogger=bloggerService.find();
		JSONObject jsonObject=JSONObject.fromObject(blogger);
		ResponseUtil.write(response, jsonObject);
		return null;
	}
	
	/**
	 * 修改博主密码
	 */
	@RequestMapping("/modifyPassword")
	public String modifyPassword(String newPassword,HttpServletResponse response)throws Exception{
		Blogger blogger=new Blogger();
		blogger.setPassword(CryptographyUtil.md5(newPassword, "java1234"));
		int resultTotal=bloggerService.update(blogger);
		JSONObject result=new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 注销
	 */
	@RequestMapping("/logout")
	public String  logout()throws Exception{
		SecurityUtils.getSubject().logout();
		return "redirect:/login.jsp";
	}
}
