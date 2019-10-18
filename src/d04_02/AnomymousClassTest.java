package d04_02;
/*
 익명 클래스 (무명 클래스)
 	클래스의 몸체는 정의되고 이름이 없는 클래스
 	
 이름이 있는 클래스
 														//클래스 선언 (이름 붙임), 객체생성, 주소를 반환 - > 참조변수 rc 저장
	 class Audio implements RemoteControl {				
	 	구현 코드들
	 	
	 }
	 
	 RemoteControl rc = new Audio();
 
익명 클래스 
														//클래스 선언과 동시에 객체를 생성해서 주소반환, 참조변수 rc에 저장
	RemoteControl rc = new RemoteControl(){
		구현 코드들
	};
 
 */

interface Remotable{
	void turnOn();
	void turnOff();
	
}
public class AnomymousClassTest {
	public static void main(String[] args) {
		/*
		 클래스를 정의하면서 동시에 객체를 생성
		 이름이 없어서 한번만 사용가능 
		 장점 : 코드의 양을 줄일 수 있음
		 
		 */
		Remotable rc = new Remotable() {
			
			@Override
			public void turnOn() {
				System.out.println("On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Off");
			}
			
		};
		
		rc.turnOn();
		rc.turnOff();
		
		
	}
}
