package d04;
/*
 소리내기 인터페이스 : soundable
 - sound() 선언
 
 구현 클래스
 - Cat1 클래스
 - Dog1 클래스
 
 		-> souondable 인터페이스 구현
 		
 인터페이스를 사용하는 이유
 	1.  시스템을 구성하는 클래스들을 효율적으로 디자인 할 수 있음
 	2.	정형화된 틀안에서 클래스를 개발 할 수 있음
 	3. 	서로 연관이 없는 클래스들 끼리 관계를 맺어줄 수 있음
 */
interface Soundable {
	abstract void sound();
}
class Cat1 implements Soundable{

	@Override
	public void sound() {
		System.out.println("냥냥");
	}
	
}

class Dog1 implements Soundable {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}

public class InterfaceEx1   {
	public static void main(String[] args) {
		Cat1 c1 = new Cat1();

		
		//인터페이스도 구현클래스르르 참조할수 있음
		Soundable sound1 = new Cat1();
		Soundable sound2 = new Dog1();
		
		sound1.sound();
		sound2.sound();
		
	}

}
