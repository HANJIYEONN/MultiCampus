//실행 클래스
//메인함수가 있는 클래스
//객체를 생성해서 사용하는 클래스
public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();	//new 연산자 : 객체 생성연산자
		car.speed = 300;		//new Car() : Car라는 클래스로 객체생겅 
		car.color = "RED";		//객체가 생성된 메모리 주소 리턴	
		car.mileage = 10000;	//Car car에 주소 저장
		
		car.print();
		car.speedUp();
		car.print();
		
		Car car1 = new Car();
		car1.speed = 200;
		car1.color = "BLACK";
		car.mileage = 0;
	}

}

/*
 클래스의 구성
 
 필드 
 	객체의 데이터를 저장하는 곳
 	생성자와 메소드 전체에서 사용되고 객체가 소멸하지 않는 한 객체와 함께 존재함
 메소드
 	객체의 동작에 해당하는 실행 블록
 	
 생성자
 	객체 생성시에 초기화 역활을 담당
 	
 객체의 일생
 
 1. 객체의 생성 : new 연산자를 이용해서 힙영역에 객체가 생성됨
 2. 객체의 사용 :
 */ 
