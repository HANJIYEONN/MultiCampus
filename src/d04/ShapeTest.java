package d04;
/*
 	다형성 : 여러가지의 형태를 가질 수 있는 능력
 
 	- 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
 	- 하나의 타입에 여러 객체를 대입함으로써 다양한 기능을 이용할수 있는 성질
 */
public class ShapeTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		c.draw();
		r.draw();
		
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
			//부모타입의 참조 변수로 자식타입 객체 참조가능
		s1.draw();
		s2.draw();
		
		/*
		 부모타입 참조변수인 s_arr로 자식객체 모두 참조가능
		 상속 받은 자식객체들을 배열로 관리 가능
		 서로다른 객체더라도 배열로 관리가능
		 반복문 사용가능
		 */
		
		Shape[] s_arr = new Shape[2];
		s_arr[0] = new Circle();
		s_arr[1] = new Rectangle();
		
		for (int i = 0; i < s_arr.length; i++) {
			s_arr[i].draw();
		}

		s2.draw();		// 오버라이딩 : 자식 메소드 호출
		s2.print();		// 부모 메소드 호출 
		//setWidth()메소드는 네모 클래스에 정의 shape클래스에는 정의 되어있지 않음
//		s2.setWidth();
//		s2.width;
		/*
		 강제 형변환 (하향 형변환)
		 
		 부모타입을 자식타입으로 형변환하는 것
		 자식클래스 객체인데 형변환에 의해서 일시적으로 부모클래스
		 참조변수에 의해 참조되고 있는 경우
		 
		 형식
		 
		 (자식타입)참조변수;
		 
		 */
		Circle cc = (Circle) s1;
		Rectangle rr = (Rectangle) s2;
		rr.width =1;
		rr.setHeight(2);
		
		//하향 형변환이후에는 필드/메소드접근 가능
		
//		Rectangle rrr =(Circle)s2;
		
		/*
		 객체의 타입 확인
		 
		 형식
		 
		 객체 instanceof 클래스 타입
		 왼쪽의 객체가 오른쪽에 있는 클래스 타입으로 생성된
		 객체라면 true 아니면 false 리턴
		 
		 */
		
		boolean result = s2 instanceof Shape;
		boolean result1 = s2 instanceof Rectangle;
		System.out.println(result);
		System.out.println(result1);
		
	}

}
