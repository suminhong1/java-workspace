package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] args) {
		
		OperatorPractice o = new OperatorPractice();
//		o.method1();
//		o.method2();
//		o.method3();
//		o.method4();
//		o.method5();
//		o.method6();
		
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int n = sc.nextInt();
		
		System.out.print("연필개수 : ");
		int m = sc.nextInt();
		
		System.out.println("1인당 연필개수 : " + m/n);
		System.out.println("남는 연필개수 : " + m%n);
		
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 > " );
		int q = sc.nextInt();
		
		System.out.println(q/100*100);
		
		
		
		
	}
	public void method3() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean result = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		num3 = sc.nextInt();
		
		result = (num1 == num2) && (num2 == num3);
		System.out.println(result);
		
		
		
	}
	public void method4() {
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int a = sc.nextInt();
		
		result = ((a % 2) == 0) ? "짝수다.":"홀수다.";
		System.out.println(result);	
		
		
		
	}
	
	
	public void method5() {
		String result = "";
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		num = sc.nextInt();
		
		result = (num <= 13) ? "어린이" : (num > 19) ? "성인" : "청소년";
		System.out.println(result);
		
		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수 : ");
		int a = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		int b = sc.nextInt();
				
		System.out.println("필요한 바구니의 수 : " + (a/b+((a%b+9)/10)));
	
	}
}


