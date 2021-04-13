package com.spring.di;

// 기본 데이터 타입 모델 주입 예시
public class DiSampleClass1 {

	private String id;
	private String pw;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("id : " +  this.id + "/" +  "pw : " +  this.pw + "/" + "name : " +  this.name);
	}
	
	
	
}
