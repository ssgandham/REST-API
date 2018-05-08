package com.example.test.restapi;

public class hello_bean {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public hello_bean(String string) {
		// TODO Auto-generated constructor stub
		this.msg = string;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "hello_bean [msg=" + msg + "]";
	}

}
