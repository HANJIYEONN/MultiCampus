import java.util.Scanner;

/*
 break
 �ݺ����� ������ �ߴ��ϰ� �ݺ����� ��������
 
 ����ڿ��� ������ �Է¹޾Ƽ� ����� ���ϴ� ���α׷�
 ����ڰ� �������� �Է��� ������ ������ �ݺ������� �Է¹���
 ������ �ԷµǸ� �ݺ��� ���߰� �׶����� ����ڰ� �Է��� ������ ����� ����
 */
public class p2_break {

	public static void main(String[] args) {
		Scanner  sc =  new Scanner(System.in);
		int total = 0;
		int count= 0;
		
		while (true) {
			//Ư���� ������ �Ǹ� �ݺ����� ������������ ����
			System.out.println("�����Է� : ");
			int grade = sc.nextInt();
			if (grade < 0) {
				break;
			}
			total += grade;
			count++;
			
		}
		System.out.println("����� " + total /count);
	}

}
