import java.util.Scanner;

/*
  스위치 문을 사용하여 해당 월의 일수를 알려주는 프로그램을 작성하세요.
  
  출력예시
  	일수를 알고싶은 달을 입력하세요 : 8(사용자 입력)
  	2019년 8월의 일수는 31일
  	
 연도 정보는 올해 2019년
 12월 이상의 값 이력시 : 월을 잘못 입력하셨습니다.
  +@ : 월은 윤년여부 판단해서 28일 또는 29일 
  	
 */
public class p3_switch_DayInMouth {

	public static void main(String[] args) {
		System.out.println("일수를 알고싶은 달을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		String day = null;
		
		String basic1 = "2019년";
		String basic2 = "";
		
		if (month == 1|| month == 3 || month == 5 ||month == 7 || month == 9 || month ==11 ) {
			day = "odd";
		} day = "even";
		
		switch (day) {
		case "odd":
			System.out.println("a");
		break;								
		case "even":
		System.out.println("b");
		default:
		System.out.println("월을 잘못 입력하셨습니다.");
		break;
	}
		
	}

}
