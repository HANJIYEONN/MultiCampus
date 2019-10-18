package d04;
/*
 	내부클래스
 		하나의 클래스 안에 다른 클래스를 정의할 수 있음
 		
 	형식
 		class 외부 클래스{
 			class 내부클래스 {
 			
 			}
 		}
 		
 	내부클래스의 용도
 	
 	- 특정 필드를 외부에서 자주 사용한다고 할 때, 사용이 효용적이지 못한 경우가 있음
 		특정 필드를 public으로 설정하는 것은 캡슐화에 어긋남, 
 		이럴 경우 내부 클래스를 이용하여 특정 필드를 private로 유지하면서 자유롭게 이용할 수 있도록 함
 	-  하나의 장소에서만 사용되는 클래스를 한 곳애 모을 수 있음
 	- 보다 읽기 쉽고 유지보수가 쉬운 코드가 됨
 	
 */

class OuterClass{
	
	private String secret = "비밀";
	
	public OuterClass() {
		System.out.println("외부 클래스 생성자");
		//외부클래스와 내부 클래스는 각각객체화 해야함
		InnerClass in = new InnerClass();
		in.method();
	}
	
	class InnerClass{
	
		public InnerClass()  {
			System.out.println("내부 클래스 생성자임");
		}
		
		public void method() {
			//내부클래스가 외부 클래스의 맴버이므로 private필드에 접근 가능하다
			System.out.println(secret);
			
		}
		
	}
}
public class OutterClassTest {
	public static void main(String[] args) {
//		new OuterClass();
		OuterClass out = new OuterClass();
		//내부클래스 객체화
		OuterClass.InnerClass in = out.new InnerClass();
		in.method();
	
	}
	

}
