package com.kh.practice;
import java.util.Scanner;
public class VariablePractice {
	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름
	public static void main(String[] args) {
		VariablePractice vp = new VariablePractice();
		
//		vp.method1();
//		vp.method2();
//		vp.method3();
//		vp.method4();
	}	
		
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 =sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과  : " + (num1 - num2));
		System.out.println("곱하기 결과  : " + (num1 * num2));
		System.out.println("나누기 몫 결과  : " + (num1 / num2));
	
	}
	
	public void method2() {
		 Scanner sc = new Scanner(System.in);
		
		 int adult = 10000;
		 int student = 7000;
		
		 System.out.print("성인은 몇명입니까? > ");
		 int num1 =sc.nextInt();
		
		 System.out.print("청소년은 몇명입니까? > ");
		 int num2 =sc.nextInt();
		
		 System.out.println("지불해야 하는 금액은 " + ((num1*adult) + (num2*student)) + "입니다.");
		
	}
	
	public void method3() {
		
		int x = 5;
		int y = 7;
		int z = 9;
		
		x = 7;
		y = 9;
		z = 5;
		
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("첫번째 문자 : " + (name.charAt(0)));
		System.out.println("두번째 문자 : " + (name.charAt(7))); //여기가 좀 아쉬워서 피드백 부탁드립니다.
		
	}
}