package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	
	public static void main(String[] args) {
		CastingPractice cp = new CastingPractice();
//		cp.method1();
		cp.method2();
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		 char c = sc.next().charAt(0);
		

		System.out.println( c + " unicode : " + (int)c );
		System.out.println(((int)c+1) + " unicode : " + ((int)c+1)); // 
	}

	public void method2() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int k = sc.nextInt();
		System.out.print("영어 : ");
		int e = sc.nextInt();
		System.out.print("수학 : ");
		int m = sc.nextInt();
		
		
		System.out.println("총점 : " + );
		System.out.printf("%.3f\t" , );

	}
}