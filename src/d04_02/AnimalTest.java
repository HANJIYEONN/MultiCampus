package d04_02;

abstract class Animal{
//	public void sound() {}

	//추상메소드
	public abstract void sound();
	//abstract 키워드 : 메소드의 몸체가 없는 메소드
	
}

class Dog extends Animal {
//추상메소드에 추상메소드 sound() 선언  	-> 실제클래스가 sound()를 구현해야하도록 강제함
//								-> 메소드가 통일 될 수 있음
//추상 메소드가 있는 클래스 -> 추상 클래스
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}


class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("냥냥");
	}
	
}

public class AnimalTest {

}
