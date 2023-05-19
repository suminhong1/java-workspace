package com.kh.practice;
import java.util.Scanner;
public class CastingPractice {
	public static void main(String[] args) {
		CastingPractice cp = new CastingPractice();
		cp.method1();
//		cp.method2();
	}
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char c = sc.next().charAt(0);
		
		char u = (char) ((int) c+1);
		System.out.println(c + " unicode : " + (int) c);
		System.out.println(u + " unicode : " + ((int) c + 1));
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int k = sc.nextInt();
		System.out.print("영어 : ");
		int e = sc.nextInt();
		System.out.print("수학 : ");
		int m = sc.nextInt();
		double a = ((k + e + m) / 3d);
		String str = ("평균 :");
		System.out.println("총점 : " + (k + e + m));
		System.out.printf("%s %.2f\t ", str, a);
	}
}







