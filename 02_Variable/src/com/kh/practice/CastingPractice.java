package com.kh.practice;

import java.awt.SystemTray;
import java.util.Scanner;

public class CastingPractice {
	
	public static void main(String[] args) {
		CastingPractice cp = new CastingPractice();
		cp.method1();
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char a = sc.next();
		
		System.out.println( + " unicode :");
		System.out.println( + " unicode :");
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int k = sc.nextInt();
		System.out.print("영어 : ");
		int e = sc.nextInt();
		System.out.print("수학 : ");
		int m = sc.nextInt();
		
		System.out.println("총점 : " + (k+e+m));
		System.out.println("평균 : " + (k+e+m)/3);
	}
}
