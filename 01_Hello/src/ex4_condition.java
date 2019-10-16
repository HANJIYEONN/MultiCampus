import java.util.Scanner;

public class ex4_condition {

	public static void main(String[] args) {
		//조건문
		//조건식의 값이 참인지 거짓인지에 따라서 실행문의 제어가 결전됨
		
		//if 조건문
		
//		if (배고프면) {
//			냉장고에 있는 빵먹어		
//		}
//		() : 조건
//		{} : 조건이 맞으면 실행될 실행문장
		int hunger = 40;
		// 50이하면 "냉장고에 있는 빵먹어" 출력
		if (hunger <= 50) {
			System.out.println("냉장고에 있는 빵먹어");
		}
		
		//if -else 조건문
		//조건을 만족할 때 실행할 문장과
		//조건을 만족하지 않을 때 실행할 문장을 지정
		
		//비가 오면 빨래를 방안에 널고, 아니면 밖에 널어
		
//		if (비가오면) {
//			빨래 방안
//		} else {
//			빨래 밖에
//		}

			//() : 조건
			//if {} :  참이면
			//else {} : 거짓이면
		
		//중첩 조건문
		//if문 안에 다시 if문 오는 경우
		//else문 안에 다시 if 문 오는 경우
		int score = 85;
		if (score >= 80 ) {
			if(score >= 90) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
			
		} else {
			System.out.println("A/B 둘다 못 받음");
		}
		
		//if - else if 조건문
		//조건이 여러개일 경우 사용
		//else 부분에서 다시 if를 사용해서 조거 확인
		
		/*
		 if(2/3정도가 남으면){
		 	냄비에 두고
		 } else if (반정도 남으면) {
		 	냉장고에 두고
		 }
		 else {
		 	버려
		 }
		 */
		
		//switch문
		//여러가지 중에서 하나를 선택하는데 사용
		//if문과 같은 조건문이 아니라 특정한 값으로 결정되는 식이옴
		int num;
		System.out.println("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		switch (num) {	 							//switch문이 지켜볼 변수 : num
		case 1:										//num변수안에 내용물이 1일 경우 
			System.out.println("하나");
			break;									//뒤의 내용을 생각하지말고 스위치문 나가
		case 2:										//num변수안에 내용물이 3일 경우 
			System.out.println("둘");
			break;									//뒤의 내용을 생각하지말고 스위치문 나가
		case 3:										//num변수안에 내용물이 3일 경우 
			System.out.println("셋");
			break;									//뒤의 내용을 생각하지말고 스위치문 나가
		default:
			System.out.println("삼보다 큼");
			break;
		}
	}

}
