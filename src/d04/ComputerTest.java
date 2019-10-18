package d04;
/*
 Cals
 	areaCircle 메소드 : 원의 넓이 구하기(매개변수 : 원의 반지름)
 	3.14
 
 Computer클래스
  Math.PI
 */

//메소드 오버라이딩의 규칙 - 동일한 메소드 시그니처
class Cals{
	public double areaCircle(double r) {
		return r*r*3.14;
	}
}

class Computer extends Cals{
	public double areaCircle(double r) {
		return r*r*Math.PI;
	}	
}


public class ComputerTest {
	public static void main(String[] args) {
		Cals c1 = new Cals();
		System.out.println(c1.areaCircle(5));
		Computer c2 = new Computer();
		System.out.println(c2.areaCircle(5));
	}

}
