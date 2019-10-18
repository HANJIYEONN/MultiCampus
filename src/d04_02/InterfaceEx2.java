package d04_02;

interface SayHello{
	void sayHello();
}

interface SayByebye{
	void sayByebye();
}

class Kor implements SayHello, SayByebye {

	@Override
	public void sayHello() {
		System.out.println("하이하이");
	}

	@Override
	public void sayByebye() {
		System.out.println("바이바이");
	}
	
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		Kor kor = new Kor();
		kor.sayHello();
		kor.sayByebye();
		
	}

}
