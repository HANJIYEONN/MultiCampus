import java.util.Scanner;



/*
 비만 측정 프로그램
 bmi = 체중 / (신장 ^2)
 
 메소드 : calculate
 필요한 데이터 : 체중 (double), 신장(double)
 
 calculate 메소드로부터 얻어진 bmi지수를 이용해서
  진단결과를 나타내고 싶다면?
  
  1. 기존에 개발한 메소드를 수정해서 사용
  2. 기존의 메소드는 그대로 두고 새로운 메소드를 작성해서 연동시켜라
  
  getResult 메소드 : bmi 지수를  토대로 진단 결과 출력
  30~ 			: 비만
  20~30			: 정상
  13~20			: 마름
  10~13			: 영양실조
  ~10			: 비정상
  
 */
public class BMI_machine {
	
	public static void main(String[] args) {
		BMI_machine bm = new BMI_machine();
		double bmi = bm.calculate(40, 1.80);
		String result= bm.getResult(bmi);
		System.out.println(result);
		
	}

	public String getResult(double bmi) {
		if (bmi > 30) {
			return "비만";
		} else if(bmi > 20) {
			return "정상";
		} else if(bmi > 13) {
			return "마름";
		} else if(bmi > 10) {
			return "영양실조";
		} else 	return "비정상" ;
	}
	
	public double calculate(double w, double h) {
		System.out.println("BMI지수 구하기"); 
		double bmi = w/(h*h);
		System.out.println(bmi);
		return bmi;
	}
	
	//객체 : 로직(기능과) 데이터를 결합한 형태의 구조
	
	
	/*
	 
	 객체 : 데이터 + 기능 결합 구조
	 
	 클래스와 객체
	 
		 데이터와 로직을 묶어서 누구나 동일한 기능을 사용할 수 있게 하고, 누구나 필요한 자기만의 데이터를
		 보관하기 위한 스펙을 미리 결정해 둔 것
		 
	 클래스 
	 	
	 	복사본을 만들기 위한 원형
	 	각자 보관하고 싶어지는 데이터 혹은 속성들을 정의
	 	데이터에 관계없이 제공되는 같은 기능이나 로직
	 */
}
