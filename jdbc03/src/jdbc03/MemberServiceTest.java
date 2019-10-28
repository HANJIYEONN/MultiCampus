package jdbc03;

import java.util.Scanner;

public class MemberServiceTest {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
//		ms.join("HONG", "1234", "1234", "홍길동", "hong@gmail.com");
		MemberDao dao = new MemberDao();
		
		/*
		 사용자에게 아이디, 비번, 비번확인, 이메일을 입력받아서
		 회원가입을 진행 -> 결과를 출력
		 
		 */
		
		
		System.out.println("아이디를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pwd1 = sc.nextLine();
		System.out.println("비밀번호를 다시 입력하세요");
		String pwd2 = sc.nextLine();
		System.out.println("이름를 입력하세요");
		String name = sc.nextLine();
		System.out.println("이메일를 입력하세요");
		String email = sc.nextLine();
		
		int result = ms.join(id, pwd1, pwd2, name, email);
	//	System.err.println(result);
		
		switch (result) {
		case 1:
			System.out.println("회원가입 완료");
			break;
		case 2:
			System.out.println("아이디가 이미 사용중입니다");
			break;
		case 3:
			System.out.println("비밀번호가 다릅니다");
			break;
		default:
			break;
		}
		
	}

}
