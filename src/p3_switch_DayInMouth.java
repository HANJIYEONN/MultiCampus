import java.util.Scanner;

/*
  ����ġ ���� ����Ͽ� �ش� ���� �ϼ��� �˷��ִ� ���α׷��� �ۼ��ϼ���.
  
  ��¿���
  	�ϼ��� �˰���� ���� �Է��ϼ��� : 8(����� �Է�)
  	2019�� 8���� �ϼ��� 31��
  	
 ���� ������ ���� 2019��
 12�� �̻��� �� �̷½� : ���� �߸� �Է��ϼ̽��ϴ�.
  +@ : ���� ���⿩�� �Ǵ��ؼ� 28�� �Ǵ� 29�� 
  	
 */
public class p3_switch_DayInMouth {

	public static void main(String[] args) {
		System.out.println("�ϼ��� �˰���� ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int thisYear = 2019;
		String day = "error";
		
		if (month == 1|| month == 3 || month == 5 ||month == 7 || month == 9 || month ==11 ) {
			day = "odd";
		} else if (month == 4 || month == 6 ||month == 8 || month == 10 || month == 12){
			day = "even";
		} else if (month == 2 && thisYear % 4 == 0) {
			day = "leaf";
		} else if(month == 2 && thisYear % 4 != 0) {
			day = "notLeaf";
		} 
			
			
//	  	2019�� 8���� �ϼ��� 31��
		switch (day) {
		case "odd":
			System.out.println(thisYear+"�� "+month+"���� �ϼ��� 30��");
			break;								
		case "even":
			System.out.println(thisYear+"�� "+month+"���� �ϼ��� 31��");
			break;		
		case "leaf":
			System.out.println(thisYear+"�� "+month+"���� �ϼ��� 28��");
			break;		
		case "notLeaf":
			System.out.println(thisYear+"�� "+month+"���� �ϼ��� 29��");
			break;	
		default:
		System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
	}
		
	}

}