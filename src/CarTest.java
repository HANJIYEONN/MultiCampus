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
