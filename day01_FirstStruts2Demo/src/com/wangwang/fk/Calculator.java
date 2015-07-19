package com.wangwang.fk;



import com.wangwang.exception.MyException;

public class Calculator {
	private String num1;
	private String num2;
	private String type;
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String execute() throws Exception {
		
		return "success";
	}

	public String calculation() throws MyException {
		if (getNum1() == null || getNum1().equals(""))
			throw new MyException("������1����Ϊ��");
		if (getNum2() == null || getNum2().equals(""))
			throw new MyException("������2����Ϊ��");
		if (Integer.valueOf(getNum2()) == 0)
			throw new RuntimeException("��������Ϊ0");
		switch (getType()) {
		case "+":
			setResult((Integer.valueOf(getNum1()) + Integer.valueOf(getNum2()))+"");
			break;
		case "-":
			setResult((Integer.valueOf(getNum1()) - Integer.valueOf(getNum2()))+"");
			break;
		case "*":
			setResult((Integer.valueOf(getNum1()) * Integer.valueOf(getNum2()))+"");
			break;
		case "/":
			setResult((Integer.valueOf(getNum1()) / Integer.valueOf(getNum2()))+"");
			break;
		default:
			throw new MyException("����������Ͳ���ȷ");
			
		}

		return "success";
	}
}
