package com.kh.example.practice1.model;

public class Member {

	public String memberId;
	public String memberPwd;
	public String memberName = "홍수민";
	public int age ;
	public char gender;
	public String phone;
	public String email;
	
	public void changeName(String name) {// 매개 변수
		memberName = name;
	}
	public void printName() {
		System.out.println(memberName);
	}
}
