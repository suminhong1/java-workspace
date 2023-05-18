package com.kh.variable;

public class C_printf {
	
	public static void main(String[] args) {
		
		//System.out.print(출력하고자하는값); - 출력만 함(줄바꿈 발생 x)
		//System.out.println(출력하고자하는값); - 출력 후 줄바꿈 발생 O
		
		System.out.print("hello\n");
		System.out.println("hello");
		
		// System.out.prinf("출력하고자 하는 형식(포맷)", 출력하고자하는값, 값, ...);
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행
		
		/*
		 * 포맷으로 쓰이는 키워드
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자열(문자도 가능)
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		//10% 20%
		
		System.out.println(iNum1 + "% " + iNum2 + "%");
		System.out.printf("%d%% %d%%\n", iNum1, iNum2);
		
		
//		System.out.print(iNum1 + "% ");
//		System.out.print(iNum2 + "%");
		
		System.out.println("------------------------");
		
		//5칸의 공간 확보 후 오른쪽 정렬 (음수면 왼쪽)
		System.out.printf("%5d\n", iNum1);
		System.out.printf("%5d\n", 250);
		System.out.printf("%-5d\n", -12);
		
		System.out.println("-------------------------");
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		// 무조건 소수점 아래 6째자리까지 보여줌
		System.out.printf("%f\t %f\n", dNum1, dNum2);
		System.out.printf("%.3f\t %.2f\n", dNum1, dNum2);
		
		System.out.println("------------------------");
		
		char ch = 'a';
		String str = "Hello";
		
		// a Hello a
		
		System.out.printf("%s %s %s\n", ch, str, ch);
		
		// A HELLO A
		
		System.out.printf("%S %S %S" , ch, str, ch);
	}

}









