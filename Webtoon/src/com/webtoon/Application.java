package com.webtoon;

import java.util.List;
import java.util.Scanner;

import com.webtoon.controller.UserController;
import com.webtoon.controller.WebtoonController;
import com.webtoon.model.User;
import com.webtoon.model.Webtoon;

public class Application {

	static Application app = new Application();
	static Scanner sc = new Scanner(System.in);
	static UserController uc = new UserController();
	static User user = new User();
	static WebtoonController wc =  new WebtoonController();

	public static void main(String[] args) {

		app.mainMenu();

	}

	public void mainMenu() {
		boolean check = true;

		while (check) {
			System.out.println("1. 회원 메뉴");
			System.out.println("2. 웹툰 메뉴");
			System.out.println("3. 종료");
			System.out.print("메뉴 번호 : ");

			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				user();
				break;
			case 2:
				webtoon();
				break;
			case 3:
				System.out.println("종료");
				check = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void user() {

		boolean check = true;

		System.out.println("1. 회원 가입");
		System.out.println("2. 로그인");
		System.out.println("3. 회원 정보 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 정보 삭제");
		System.out.println("6. 메인 메뉴로 돌아가기");
		System.out.print("메뉴 번호 : ");

		switch (Integer.parseInt(sc.nextLine())) {
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
			updateUser();
			break;
		case 5:
			deleteUser();
			break;
		case 6:
			mainMenu();
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}

	}

	public void signUp() {

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("ID 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		System.out.print("Email 입력 : ");
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
		if (login) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

	public void viewProfile() {
		System.out.println("프로필 조회");
		System.out.print("ID 입력: ");
		String id = sc.nextLine();

		User loginId = uc.viewProfile(id);
		if (loginId != null) {
			System.out.println("프로필 정보");
			System.out.println("ID : " + loginId.getId());
			System.out.println("이름 : " + loginId.getName());
			System.out.println("email : " + loginId.getEmail());
		}
	}

	public void updateUser() {

		System.out.println("프로필 수정");
		System.out.print("수정할 ID 입력: ");
		String id = sc.nextLine();
		User userProfile = uc.viewProfile(id);
		if (userProfile != null) {
			System.out.print("새로운 이름 입력: ");
			String newName = sc.nextLine();
			System.out.print("새로운 Email 입력: ");
			String newEmail = sc.nextLine();
			if (uc.updateProfile(id, newName, newEmail)) {
				System.out.println("프로필이 수정되었습니다.");
			} else {
				System.out.println("프로필 수정에 실패했습니다.");
			}
		} else {
			System.out.println("프로필을 조회할 수 없습니다.");
		}

	}

	public void deleteUser() {
		System.out.println("프로필 삭제");
		System.out.print("삭제할 ID 입력: ");
		String id = sc.nextLine();
		if (uc.deleteProfile(id)) {
			System.out.println("프로필이 삭제되었습니다.");
		} else {
			System.out.println("프로필 삭제에 실패했습니다.");
		}
	}
	public void webtoon() {
		System.out.println("1. 웹툰 등록");
		System.out.println("2. 웹툰 조회");
		System.out.println("3. 웹툰 수정");
		System.out.println("4. 웹툰 삭제");
		System.out.println("5. 메인 메뉴로 돌아가기");
		System.out.print("메뉴 번호 : ");

		switch (Integer.parseInt(sc.nextLine())) {
		case 1:
			addWebtoon();
			break;
		case 2:
			viewWebtoon();
			break;
		case 3:
			updateWebtoon();
			break;
		case 4:
			deleteWebtoon();
			break;
		case 5:
			mainMenu();
			break;
			default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}

	}

	public void addWebtoon() {
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("장르 입력 : ");
		String genre = sc.nextLine();
		System.out.print("작가 입력 : ");
		String writer = sc.nextLine();
		
		Webtoon webtoon = new Webtoon( title,genre,writer);
		wc.addWebtoon(webtoon);
		System.out.println("웹툰 등록 완료.");
		
	}
	public void viewAllWebtoons() {
	    System.out.println("모든 웹툰 조회");
	    List<Webtoon> webtoonList = wc.getAllWebtoons();
	    if (!webtoonList.isEmpty()) {
	        System.out.println("----- 웹툰 목록 -----");
	        for (Webtoon webtoon : webtoonList) {
	            System.out.println("웹툰 제목: " + webtoon.getTitle());
	            System.out.println("장르: " + webtoon.getGenre());
	            System.out.println("작가: " + webtoon.getWriter());
	            System.out.println("--------------------");
	        }
	    } else {
	        System.out.println("조회할 웹툰이 없습니다.");
	    }
	}
	public void viewWebtoon() {
	    System.out.println("1. 웹툰 전체 조회");
	    System.out.println("2. 특정 웹툰 조회");
	    System.out.print("메뉴 번호: ");

	    switch (Integer.parseInt(sc.nextLine())) {
	        case 1:
	            viewAllWebtoons();
	            break;
	        case 2:
	            System.out.print("제목 입력: ");
	            String title = sc.nextLine();
	            Webtoon viewWebtoon = wc.viewWebtoon(title);
	            if (viewWebtoon != null) {
	                System.out.println("웹툰 정보");
	                System.out.println("웹툰 제목: " + viewWebtoon.getTitle());
	                System.out.println("장르: " + viewWebtoon.getGenre());
	                System.out.println("작가: " + viewWebtoon.getWriter());
	            } else {
	                System.out.println("조회할 수 없습니다. 다시 입력해주세요.");
	                viewWebtoon();
	            }
	            break;
	        default:
	            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
	    }
	}

	public void updateWebtoon() {

		System.out.println("웹툰 수정");
		System.out.print("수정할 제목 입력: ");
		String title = sc.nextLine();
		Webtoon webtoonInfo = wc.viewWebtoon(title);
		if (webtoonInfo != null) {
			System.out.print("새로운 제목 입력 : ");
			String newTitle = sc.nextLine();
			System.out.print("새로운 장르 입력 : ");
			String newGenre = sc.nextLine();
			System.out.print("새로운 작가 입력 : ");
			String newWriter = sc.nextLine();
			if (wc.updateWebtoon(title, newTitle, newGenre, newWriter)) {
				System.out.println("웹툰이 수정되었습니다.");
			} else {
				System.out.println("웹툰 수정에 실패했습니다.");
			}
		} else {
			System.out.println("웹툰을 조회할 수 없습니다.");
		}

	}

	public void deleteWebtoon() {

		System.out.println("웹툰 삭제");
		System.out.print("삭제할 웹툰 제목 입력 : ");
		String title = sc.nextLine();
		if (wc.deleteWebtoon(title)) {
			System.out.println("웹툰이 삭제되었습니다.");
		} else {
			System.out.println("웹툰 삭제에 실패했습니다.");
		}
	}
}