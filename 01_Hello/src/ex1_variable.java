
public class ex1_variable {

	public static void main(String[] args) {
		/*
		 데이터타입
		 */
		//정수형
		
		int i = 26; //10진수를 26으로 표현
		int oi= 032; // 8진수로 26으로 표현
		int xi = 0x1a; //16진수로 26을 표현
		
		System.out.println(i);
		System.out.println(oi);
		System.out.println(xi);
		
		//long : 부호가 있는 정수
		//64bit로 정수를 저장
		//수치가 큰 데이터를 다루는 프로그램에서 long 형 사용
		
		//실수형
		//소수점이 있는 데이터를 저장 
		//float : 32bit
		//double : 64bit
		
		//자바는 실수의 기본타입을 double로 간주함
/*		
		float rad, area;
		float PI = 3.141592F;
		
		rad = 5;
		area = rad* rad * PI;
		System.out.println(area);
*/		
		//double
		double PI = 3.141592;
		double r1 = 1.23e2;		//e2 : 10^2
		double r2 = 1.23e-2;	//e-2 : 10^-2
		System.out.println(r1);
		System.out.println(r2);
		
		// 논리형
		// bollean 참인지 거짓인지를 판단,	 결과값 : true / false
		boolean condition = true;
		condition = false;
		System.out.println(condition);
		
		boolean b;
		//값을 직접 대입
		b = false;
		System.out.println(b);
		
		b = 1 > 2; //비교연산을 하고 결과로 boolean형을 데이터가 나옴
		

	}

}
