package com.test.action;

import com.opensymphony.xwork2.ActionSupport;

public class MethodAction extends ActionSupport {

	// add ��ӷ���
	public String add() {
		System.out.println("add............");
		return NONE;
	}

	// update ����
	public String update() {
		System.out.println("update.........");
		return NONE;
	}
	
	//del����
	public String del() {
		System.out.println("del..........");
		return NONE;
	}
}
