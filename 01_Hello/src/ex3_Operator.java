/*
 * 연산자 : 특정한 연산을 나타내는 기호
 * 피연산자 : 연산의 대상
 * 수식 : 상수나 변수, 함수와 같은 피연산자들의 조합
 * 대입 연산자 : 왼쪽의 변수에 오른쪽의 수식의 값을 계산하여 저장 
 * */
public class ex3_Operator {

	public static void main(String[] args) {
		int result;
		// 사칙연산
		result = 3 + 2;
		System.out.println(result);
		result = 3 - 2;
		System.out.println(result);
		result = 3 * 2;
		System.out.println(result);
		result = 3 / 2;
		System.out.println(result);
		result = 3 % 2;  //% : 나머지 연산
		System.out.println(result);
		
		//단황연산자 : 피연산자가 하나뿐인 연산자
		
		//부호 연산자
		int num1 = -100;
		int num2 = +100;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1+num2);
		
		//증감연산자
		int x = 1;
		int y = 1;
		
		int nextX = x++;
		int nextY = ++y;
		System.out.println(nextX);
		System.out.println(nextY);
		
		//논리 부정연산자
		//논리형 데이터를 반전시켜주는 연산자
		boolean isOK = true;
		System.out.println(isOK);
		
		isOK = !isOK;
		System.out.println(isOK);
		
		//복합대입연산자
		int i = 10;
		int j = 20;
		
		System.out.println(i);
		i += j; 				
		System.out.println(i);
		i -= j;					
		System.out.println(i);
		i *= j;
		System.out.println(i);
		i /= j;
		System.out.println(i);
		i %= j;
		System.out.println(i);
		
		
		//관계 연산자
		//관계연산자는 두 수의 값을 비교하기 위한 연산자를 의미함
		//주로 선택문과 반복문의 조건식으로 사용됨
		//관계연산자의 결과 항상 true 또는 false가 됨
		
		int a = 3;
		int b = 4;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a <= b);
		
		//논리연산자
		
		//AND
		//둘다 맞아야 함
		//두 값이 모두 1이면 1, 아니면 0
		
		//0 AND 1 -> 0
		//0 AND 0 -> 0 
		//1 AND 1 -> 1
		//1 AND 0 -> 0
		
		System.out.println((a==3) && (b==7));
								//true AND false - > false 		
		System.out.println((a==3) && (b==4));
								//true AND false - > true
		
		
		//OR 연산자 
			//둘중에 하나만 맞아도 참
			//둘중에 하나라도 1이면 1 아니면0
				//0 AND 1 -> 1
				//0 AND 0 -> 0 
				//1 AND 1 -> 1
				//1 AND 0 -> 1
		
		System.out.println((a==3) || (b==7));
		//true AND false - > true	
		System.out.println((a==3) || (b==4));
		//true AND false - > true
		
		//비트 연산자
		//bit : 최소단위, 0과 1로 표시
		//데이터를 비트 단위로 연산
		
		int c = 10; //1010
		int d = 7; // 0111
		
		//10진수를 2진수로 변환
		
		int e = c & d;
		System.out.println(e);
		
		//1010
		//OR
		//0111
		//----
		//1111
		
		int f = c | d;
		System.out.println(f);
		
		//시프트 연산자
		int g = c >> 1;
		//>> : 오른쪽으로 쉬프트
		//1010
		//01010
		//0101 -> 오른쪽으로 밀고 넘치는 비트 제거
		System.out.println(g);
		int k = c << 1;
		//1010
		//10100	-> 왼쪽으로 쉬프트
		//10100 : 그대로 사용
		System.out.println(k);
		
		//삼항연산자
		//변수  = (조건식) ?  조건이 맞으면 실행되는 실행문 :  조건이 틀리면 실행되는 실행문
		String result1 = (true) ?  "happy" : "sad";
		System.out.println(result1);
	
		String result2 = (false) ?  "happy" : "sad";
		System.out.println(result2);
		
		int score = 60;
		int limit = 50;
		//50점 초과면 합격, 아니면 불합격
		String result3 = (score > limit) ? "합격" : "불합격";
		System.out.println(result3);
	}

}
