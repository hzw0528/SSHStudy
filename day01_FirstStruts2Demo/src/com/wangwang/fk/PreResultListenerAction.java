package com.wangwang.fk;

import java.util.Date;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;


public class PreResultListenerAction {
	public String execute() throws Exception {
		// 获得ActionInvocation
		ActionInvocation actionInvocation = ActionContext.getContext()
				.getActionInvocation();
		actionInvocation.addPreResultListener(new PreResultListener() {

			@Override
			public void beforeResult(ActionInvocation invocation,
					String resultCode) {
				System.out.println("This is result code:" + resultCode);
				// 返回视图之前加入一些额外的数据
				invocation.getInvocationContext().put("mydata",
						new Date() + "由" + resultCode + "逻辑视图转入");
				// 可以写一些日志

			}
		});
		return "success";
	}
}
