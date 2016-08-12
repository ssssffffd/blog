package com.kp.entity;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 博客实体
 */
public class Blog {

	private Integer id;
;	private String title; //标题
	private String summary; //摘要
	private Date releaseDate; // 发布日期
 	private Integer clickHit; // 阅览次数
	private Integer replyHit; // 评论次数
	private String content; // 内容
	private String contentNoTag; // 无网页标签的内容，lucene分词用
	private BlogType blogType; // 博客类型
	
	private Integer blogCount; // 博客数量，非表的字段，用于根据发布日期的归档
	private String releaseDateStr; // 发布日期的字符串，仅年和月
	private String keyWord; // 关键字，空格隔开
	
	private List<String> imagesList=new LinkedList<String>(); // 图片，用于列表展示显示缩略图
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Integer getClickHit() {
		return clickHit;
	}
	public void setClickHit(Integer clickHit) {
		this.clickHit = clickHit;
	}
	public Integer getReplyHit() {
		return replyHit;
	}
	public void setReplyHit(Integer replyHit) {
		this.replyHit = replyHit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContentNoTag() {
		return contentNoTag;
	}
	public void setContentNoTag(String contentNoTag) {
		this.contentNoTag = contentNoTag;
	}
	public BlogType getBlogType() {
		return blogType;
	}
	public void setBlogType(BlogType blogType) {
		this.blogType = blogType;
	}
	public Integer getBlogCount() {
		return blogCount;
	}
	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}
	public String getReleaseDateStr() {
		return releaseDateStr;
	}
	public void setReleaseDateStr(String releaseDateStr) {
		this.releaseDateStr = releaseDateStr;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	
	public List<String> getImagesList() {
		return imagesList;
	}
	public void setImagesList(List<String> imagesList) {
		this.imagesList = imagesList;
	}
	
	
	
}
