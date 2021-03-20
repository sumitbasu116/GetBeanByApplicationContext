package com.sumit.model;

public class TestBean {

	private String msg;
	private int code;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "TestBean [msg=" + msg + ", code=" + code + "]";
	}
}
