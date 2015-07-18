package com.wangwang.fk;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.apache.struts2.ServletActionContext;

public class ServletActionContextAction {

	public String execute() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		//PageContext pageContext = ServletActionContext.getPageContext();
		/*ServletContext servletContext = ServletActionContext
				.getServletContext();*/
		HttpSession session = request.getSession();
		session.setAttribute("name", "»ÆÖÎÍú");
		request.setAttribute("age", 25);
		Cookie cookie = new Cookie("username", "wangwang");
		response.addCookie(cookie);
        
		return "success";
	}
}
