package com.test.action;

import com.opensymphony.xwork2.ActionSupport;

public class MethodAction extends ActionSupport {

	// add 添加方法
	public String add() {
		System.out.println("add............");
		return NONE;
	}

	// update 方法
	public String update() {
		System.out.println("update.........");
		return NONE;
	}
	
	//del方法
	public String del() {
		System.out.println("del..........");
		return NONE;
	}
}
