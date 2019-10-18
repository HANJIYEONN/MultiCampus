package d04;
/*
 동적바인딩
 
 부모클래스의 참조변수로 자식클래스의 ㅐㄱ체를 참조해서 부모클래스에 존재하는 메소드를 호출할 때
 해당 메소드가 오버라이딩 되어있다면 실제 ㅗ출하는 함수는
 자식에서 오버라이딩한 메소드가 호출됨
 */
class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다");
	}
}

class Taxi extends Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}	
}

class Bus extends Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}	
}

class Driver {
	public void driver (Vehicle v) {

		/*
		 각각의 차량이 운행이 되도록 설계
		 taxi -> 운전자가 택시 운전
		 bus -> 운전자가 버스 운전 
		 */	
		v.run();
		//오버라이딩 에 의해서  v가 참조하고 있는 객체의  run이 실행됨
	}
}

public class DriverTest {
	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.run();
		taxi.run();
		
		Driver driver = new Driver();
		driver.driver(bus);
		driver.driver(taxi);
	}
	
}
