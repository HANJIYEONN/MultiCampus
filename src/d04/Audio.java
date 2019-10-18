package d04;
/*
 인터페이스
	 
	 추상클래스의 극단적인 경우
	 인터페이스는 추상 메소드들로만 이뤄짐
	 이 추상메소드들은 특정 인터페이스를 따르는 클래스들의 위한 요구 조건이 됨.
 
 인터페이스의 사전적 의미
 	두 가지 주제 혹은 시스템이 상호작용하기 위한 장치
 	
 인터페이스 선언

	//인터페이스
	 [public] interface 인터페이스명 {
	 	반환형 추상메소드명1();
	 	반환형 추상메소드명2();
	 	반환형 추상메소드명3();
	 }

	//구현클래스
 	[public] class 구현 클래스 implements 인터페이스명 {
 	
 	}
 
 */
public class Audio implements RemoteControl {
	int volume;

	//인터페이스의 추상메소드를 구현해야하는 의무를 가짐
	@Override
	public void turnOn() {
		System.out.println("오디오 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 끔");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
