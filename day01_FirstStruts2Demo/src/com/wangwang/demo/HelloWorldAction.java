package com.wangwang.demo;

public class HelloWorldAction {

	private String message;

	public String getMessage() {
		return this.message;
	}

	public String execute() {
        this.message="�ҵĵ�һ��struts2��Ӧ�ã����������ˣ�����<h3>Hello World</h3>";
		return "success";
	}
}
