package com.wangwang.fk;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class UserAction {
	private final String SUCCESS = "success";
	private final String ERROR = "error";

	public String login() {
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("tip", "login Handler!!!");
		return SUCCESS;
	}
	
	public String register()
	{
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("tip", "register Handler!!!");
		return SUCCESS;
	}
}
