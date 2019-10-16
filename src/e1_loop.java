import java.util.Scanner;

/*
  반복문 
  
  반복문을 이용하면 실행문을 원하는 횟수만큼 반복항 실행 할 수 있음*/
public class e1_loop {

	public static void main(String[] args) {
		/*
		 while문
		 
		 땀날때까지 뛰기
		 
		 while (땀안나니?) {
		 	뛰어
		}
		
		조건이 참인동안 문장을 반복적으로 실행
		조건은 참, 거짓을 판별할 수 있는 조건식이 옴
		반복이 끝날 수 있도록 조건식의 값이 바뀌도로고 설정 - > 그렇지 않으면 무한루프에 빠짐
		필요한 경우가 아니라면 무한 루프에 빠지지않게 조심
		*/
		 
		/*
		int i = 0;
		while (i < 5 ) {
			System.out.println("숫자" + i);
			i++;
		}
		*/
		
		//while문을 이용해서 구구단 출력하기
		//출력할 구구단을 단수는 사용자에게 입력받기
		
		/*
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while (i < 10 ) {
			i++;
			System.out.println(num+" * "+i+" = "+num * i);
		}
		*/
		
		
		//숫자 n을 사용자에게 입력받고
		//n보다 작고 10으로 나눠 떨어진 모든 수를 구하시오.
		//-------------------------------------------------------------------
	
//		System.out.println("숫자를 입력하세용");
//		Scanner nSc = new Scanner(System.in);
//		int n = nSc.nextInt();
//		int number = 0;
//
//		while (n<1) {
//			
//		}
		
//		if(number < n && number % 10== 0) {
//			while (n<1) {
//				
//				System.out.println(number);
//				n--;
//			}
//		}
	
		/*
		 do-while 문
		 조건이 참인동안 반복 수행, 조건을 나중에 확인
		 조건의 참, 거짓과 상관없이 내부의 문장을 최소한 한번을 실행해야할 때 사용
		 */
		/*
		int k = 0;
		do {
			System.out.println("숫자 : " + k);
			k++;
		}while (k <3);
		*/
		/*
		 숫자 맞추기 프로그램 작성
		 답은 미리 변수로 저장 (ex) int answer = 59
		 사용자가 숫자를 입력하면 정답보다 낮은지 높은지 판단하여 결과 출력
		 정답을 맞추면 시도횟수 출력
		 do-while을 이용해서 작성
		 
		 */
		
		
//		System.out.println("정답을 추측해 보세요");
//		Scanner sc2 = new Scanner(System.in);
//		
//		int time = 0;
//		int numm = sc2.nextInt();
//		int answer = 59;
//		
//		
//		do {
//
//			if (numm > answer) {
//				System.out.println("입력하신 수 보다 낮습니다");
//				time++;
//				break;
//			} else {
//				System.out.println("입력하신 수 보다 높습니다");
//				time++;
//				break;
//			}
//		} while (numm != answer) ;
//		
//		System.out.println("축하합니다. 시도횟수 : "+ time);
//		

		
		/*
		 for문
		 
		 앉았다 일어났다 5번 반복
		 
		 for (횟수를 세기 위한 변수; 조건식; 증감식){
		 실행문장
		 }
		 */
		/*
		for (int j = 0; j <5; j++ ) {
			System.out.println("앉았다 일어났다 ");
		}
		*/
		//1부터 10까지 더해서 결과 출력
		/*
		int sum = 1 ;
		for (int q = 0; q < 11; q++ ) {
			sum += q;
		}
		
		System.out.println(sum);
		*/
		//2단을 for문으로
		/*
		for (int q = 1; q < 10; q++ ) {
			int p = 2;
			System.out.println(p+" * "+q+" = "+p*q);
		}
		*/
		//2단으로 for문으로 
		
		// 1+1+2+1+2+3+...+10 결과 계산
		/*
		sum = 0;
		int total = 0; 
		for (int q = 0; q < 10; q++) {
		 for (int p =0; p <10; p++) {
			 sum += p;
		 }
		 	total = sum + q; 
		}
		System.out.println(sum);
		*/
		//중첩 for문 
		//반복문안에 반복문
		/*
		for(초기값1;조건식1;증감식1) {
			for (초기값2;조건식2;증감식2) {
				문장;
			}
			문장;
		}
		*/
		/*
		for (int ii = 1; ii <= 10; ii++ ) {
			System.out.println(" 바깥쪽 시작"+ ii);
			for(int jj =1; jj <= 10; jj++) {
				System.out.println(" 안쪽 "+ jj);
			}
			System.out.println(" 바깥쪽 끝"+ ii);
		}
		*/
		//2~9단을 이중 for문으로 구현
		/*
		for (int ii = 2; ii < 10; ii++ ) {

			for(int jj =1; jj < 10; jj++) {
				System.out.println(ii+"*"+jj+"="+ii*jj);
			}

		}
		*/
		
		//문제 
		//트리만들기
		for(int ii = 1; ii < 6; ii++) {
			for(int jj = 0; jj <ii; jj++) {
				System.out.printf("*");
			}
			
			System.out.println("\n");
		}
		

	}

}
