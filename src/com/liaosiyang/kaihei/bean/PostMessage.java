package com.liaosiyang.kaihei.bean;


import cn.bmob.v3.BmobObject;

public class PostMessage extends BmobObject {
	private String Name;
	private String describe;
	private String phone;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
