package com.wangwang.fk;

import java.util.Date;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;


public class PreResultListenerAction {
	public String execute() throws Exception {
		// ���ActionInvocation
		ActionInvocation actionInvocation = ActionContext.getContext()
				.getActionInvocation();
		actionInvocation.addPreResultListener(new PreResultListener() {

			@Override
			public void beforeResult(ActionInvocation invocation,
					String resultCode) {
				System.out.println("This is result code:" + resultCode);
				// ������ͼ֮ǰ����һЩ���������
				invocation.getInvocationContext().put("mydata",
						new Date() + "��" + resultCode + "�߼���ͼת��");
				// ����дһЩ��־

			}
		});
		return "success";
	}
}
