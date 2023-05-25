package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
//		Snack s = new Snack();
		SnackController scr = new SnackController();
		
		
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
//		 s.setKind(sc.nextLine());
		String kind = sc.nextLine();
		
		System.out.print("이름 : ");
//		 s.setName(sc.nextLine());
		String name = sc.nextLine();
		 
		System.out.print("맛 : ");
//		s.setFlavor(sc.nextLine());
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
//		s.setNumOf(Integer.parseInt(sc.nextLine()));
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 : ");
//		s.setPrice(Integer.parseInt(sc.nextLine()));  
		int price = Integer.parseInt(sc.nextLine());
		
		Snack s = new Snack(kind, name, flavor, numOf,price);
		
		if(scr.saveData(s)) {
		System.out.println("저장 완료되었습니다.");
		System.out.println(scr.confirmData());
		}
		
//		System.out.println(s.getKind()+"("+s.getName()+" - " + s.getFlavor() + ") "+ s.getNumOf()+"개 "+s.getPrice()+"원");
//		System.out.println(s);
	
		
		
	}
}
