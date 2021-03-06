package com.gu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Role implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String description;
	private Date createTime;
	private List<Menu>  menuList = new ArrayList<Menu>(0);
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public List<Menu> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}
}
