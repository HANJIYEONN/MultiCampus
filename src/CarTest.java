//���� Ŭ����
//�����Լ��� �ִ� Ŭ����
//��ü�� �����ؼ� ����ϴ� Ŭ����
public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();	//new ������ : ��ü ����������
		car.speed = 300;		//new Car() : Car��� Ŭ������ ��ü���� 
		car.color = "RED";		//��ü�� ������ �޸� �ּ� ����	
		car.mileage = 10000;	//Car car�� �ּ� ����
		
		car.print();
		car.speedUp();
		car.print();
		
		Car car1 = new Car();
		car1.speed = 200;
		car1.color = "BLACK";
		car.mileage = 0;
	}

}
