package com.kh._interface.step2;

public class Advanced implements Player{

	@Override
	public void run() {
		System.out.println("빨리 달리다");
	}

	@Override
	public void jump() {
		System.out.println("점프는 할수있지");
	}

	@Override
	public void turn() {
		System.out.println("턴은 못해ㅠ");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===== 중급자 레벨=====");
	}

}
