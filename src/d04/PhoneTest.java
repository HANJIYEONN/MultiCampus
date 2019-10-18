package d04;
/*
 추상 클래스
 	클래스의공통적인 특성을 추출해서 선언한 클래스
 	
 추상클래스 선언형식
 
 [public] abstract class 클래스명 {
 	필드
 	생성자
 	메소드
 }
 
 추상클래스의 용도
 	1. 실체 클래스들의 공통된 필드와 메소드의 이름을 통일할 목적
 	2. 실체 클래스를 작성할 때 시간을 절약
 	
 실체 클래스 : 객체를 직접 생성할 수 있는 클래스
 
 추상 클래스와 실체클레스
 	- 추상클래스가 부모, 실체클래스가 자식으로 구현됨
 	- 실체클래스 추상클래스의 모든 특성 물려받고, 추가적인 특성 구현가능
 	
 
 */

abstract class Phone {
	public String owner;
	
	public Phone (String owner){
		this.owner = owner;
		}
	
	public void turnOn() {
		System.out.println("전원 킴");
	}
	
	public void turnOff() {
		System.out.println("전원 끔");
	}
}

//실체 클래스 - 객체로 만드는 것은 가능
class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		
	}
	
	public void internetSearch() {
		System.out.println("웹");
	}
	
}

public class PhoneTest {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("홍길동");
		sp.turnOff();
		sp.turnOn();
		
		//Phone phone = new Phone("홍길동");  //추상 클래스로는 객체를 생성할 수 없음
	}

}
