package com.kp.entity;

/**
 * 博客类型实体
 */
public class BlogType {

	private Integer id;
	private String typeName; // 类型名称
	private Integer blogCount; // 博客数量
	private Integer orderNo; // 排序，从小到大排序显示
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getBlogCount() {
		return blogCount;
	}
	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	

	
	
}
