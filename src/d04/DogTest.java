package d04;
//상위 클래스
class Animal {
	public void sound() {
		//아직 특정한 동물이 정해져있지않기 때문에 몸체 정의 어려움
		System.out.println("????");
	}
}
/*
 메소드 오버라이딩(key point - 상속, 재정의)
 메소드 재정의 
 	서브클래스가 필요에 따라 상속된 메소드를 다시 재정의 하는 것
 */

//하위 클래스
class Dog extends Animal {
	public void sound() {
		System.out.println("멍멍");	//메소드 재정의
	}
}
//하위클래스
class Cat extends Animal{
	public void sound() {
		System.out.println("냥냥");	//메소드 재정의
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		Cat cat = new Cat();
		cat.sound();
	}

}
