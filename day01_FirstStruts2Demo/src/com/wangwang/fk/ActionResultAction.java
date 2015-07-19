package com.wangwang.fk;

public class ActionResultAction {

	private String target;

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String code() {
		return "code";
	}

	public String redirect() {
		return "redirect";
	}

	public String redirectAction() {
		return "redirectAction";
	}

	public String execute() {

		return "success";
	}
}
