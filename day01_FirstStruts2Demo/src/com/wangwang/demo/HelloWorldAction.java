package com.wangwang.demo;

public class HelloWorldAction {

	private String message;

	public String getMessage() {
		return this.message;
	}

	public String execute() {
        this.message="我的第一个struts2的应用，运行起来了！！！<h3>Hello World</h3>";
		return "success";
	}
}
