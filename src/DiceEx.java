/*
 �ֻ����� ��ȣ�� �������� �����ϴ� �޼ҵ� rollingDice�� �����϶�
 rollingDice�� ������ int ����� ��ȯ�Ѵ�
 �� ���� �ֻ����� ������ �ֻ����� ���� 5���� �ƴ����� ����ϴ� ���α׷��� �����϶�.
 */
public class DiceEx {

	public static void main(String[] args) {
		DiceEx de = new DiceEx();
		int num1 = de.rollingDice();
		int num2 = de.rollingDice();
		
	
		if (num1+num2 == 5) {
			System.out.println("���� 5�Դϴ�");
		} else {
			System.out.println("���� 5�� �ƴմϴ�");
	
		}
	}
		
	public int rollingDice() {
		int x = 0;
		x = (int) ((Math.random()*6) + 1);
		System.out.println(x);
		return x;
	}

}
