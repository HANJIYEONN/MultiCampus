/*
 주사위의 번호를 무작위로 리턴하는 메소드 rollingDice를 설게하라
 rollingDice는 정수형 int 결과를 반환한다
 두 개의 주사위를 굴려서 주사위의 합이 5인지 아닌지를 출력하는 프로그램을 생성하라.
 */
public class DiceEx {

	public static void main(String[] args) {
		DiceEx de = new DiceEx();
		int num1 = de.rollingDice();
		int num2 = de.rollingDice();
		
	
		if (num1+num2 == 5) {
			System.out.println("합이 5입니다");
		} else {
			System.out.println("합이 5가 아닙니다");
	
		}
	}
		
	public int rollingDice() {
		int x = 0;
		x = (int) ((Math.random()*6) + 1);
		System.out.println(x);
		return x;
	}

}
