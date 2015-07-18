package com.wangwang.fk;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

public class ActionInvokeServletApiDemo implements ServletRequestAware,
		ServletResponseAware {
	private HttpServletResponse resp;
	private HttpServletRequest req;

	public String execute() throws Exception {
		req.setAttribute("age", 25);
		
		// Ìí¼Ócookie
		Cookie cookie=new Cookie("user", "testuser");
		cookie.setMaxAge(60*60);
		resp.addCookie(cookie);
		resp.getWriter().print("Hello World!!");
		return "success";
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.req = request;

	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.resp = response;

	}
}
