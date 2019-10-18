/*
 상속 
 
 부모클래스의 멤버(필드, 메소드)를 자식 클래스에 물려주는 행위
 
 상속의 장점
 
 - 상속을 통해서 기존 클래스의 필드와 메소드를 재사용
 - 기존 클래스의 일부도 변경 가능 
 - 이미 작성되고 검증된 소프트웨어를 재사용
 - 코드의 중복을 방지할 수 있음
 
 부모클래스, 슈퍼클래스, 상위클래스
 자식클래스, 서브클래스, 하위클래스(파생클래스)
 
 상속문법
 
 class 자식클래스  extend 부모클래스 {
 
 }
 
 */
package d04;

public class SuperCar extends Car {
	//자식클래스에서 추가되는 내용 선언가능
	boolean turbo;

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

}
