package d04;
// 상속은 하나의 부모클래스만 가능(단일 상속)
class Parent{
	int data = 100;
	
//	public Parent() {
//		System.out.println("부모의 기본 생성자");
//	}
	
	//매개변수가 있는 생성자만 있음 ->기본생성자는 없음
//	public Parent(int data) {
//		this.data = data;
//	}
	
	public void print() {
		System.out.println("부모");
	}
}

class Child extends Parent{
	int data = 200;
	
	public Child() {
		/*
		 	자식생성자가 불리기 전에 부모생성자가 먼저 호출됨
		 	상속을 받으면 자식 클래스를 만들때 부모 객체를 먼저 만들고 자식 객체를 이어 붙여서 만듬
		 */
//		super();	//이 코드가 생략되어있음
					//부모의 기본생성자 호출 -> 기본생성자가 없으면 오류남.(부모클래스의 호출가능한 생성자가 없어서)
//		super(200);	//위의 경우는 매개변수 명시적으로 지정
		System.out.println("자식의 기본 생성자");
	}
	
	public void print() {
		int data = 300;
		super.print(); //부모메소드 호출
		System.out.println("자식");
		System.out.println(data);
		System.out.println(this.data);
		System.out.println(super.data);
	}
}

public class ParentTest {
	public static void main(String[] args) {
		new Child().print();		//메소드 오버라이딩 - 자식 메소드 호출
	}
}
