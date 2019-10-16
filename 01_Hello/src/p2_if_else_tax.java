import java.util.Scanner;

/*
 과세 표준 금액을 사용자에게 입력받음(단위 만원)
 
 과세기준
 1000만원 이하 : 9%
 1000만원 초과 4000만원 이하 : 18%
 4000만원 초과 8000만원 이하 : 27%
 8000만원 초과 : 36% 

 */

public class p2_if_else_tax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println(" 금액을 입력하여 주십시오 (단위 : 만원) ");
		int tax = sc.nextInt();
		
		if (1000 >= tax) {
			System.out.println(tax * 0.09);
		} else if( 1000 < tax && 4000 >= tax) {
			System.out.println(tax * 0.18);
		} else if( 4000 < tax && 8000 >= tax) {
			System.out.println(tax * 0.27);
		} else if (8000 < tax ){
			System.out.println(tax * 0.36);
		} else 
			System.out.println("잘못된 입력입니다");
	}

}
