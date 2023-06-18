package com.melon;

import java.util.Scanner;

import com.melon.controller.UserController;
import com.melon.model.User;

public class Application {

	static Application app = new Application();
	static Scanner sc = new Scanner(System.in);
	static UserController uc = new UserController();
	
	public static void main(String[] args) {
		
		app.mainMenu();
		
	}
	
	public void mainMenu() {
			
			boolean check = true;
			
			while(check) {
				System.out.println("1. 회원 가입");
				System.out.println("2. 로그인");
				System.out.println("3. 회원 정보 조회");
				System.out.println("4. 끝내기");
				System.out.print("메뉴 번호 : ");
				
				switch(Integer.parseInt(sc.nextLine())) {
				case 1:
					signUp();
					break;
				case 2:
					logIn();
					break;
				case 3:
					viewProfile();
					break;
				case 4:
					check = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				System.out.println("종료");
			}
		}
	public void signUp() {
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("ID 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		System.out.print("email 입력 : ");
		String email = sc.nextLine();
		
		User user = new User(id, password, name, email);
		uc.signUp(user);
		System.out.println("회원가입이 완료 되었습니다.");
		}
	public void logIn() {
		
		System.out.println("로그인");
		System.out.print("ID 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		
		boolean login = uc.login(id, password);
		if(login) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
	}
	public void viewProfile() {
		
		

	}
	
}	
	 