import java.util.Scanner;

/*
  �ݺ��� 
  
  �ݺ����� �̿��ϸ� ���๮�� ���ϴ� Ƚ����ŭ �ݺ��� ���� �� �� ����*/
public class e1_loop {

	public static void main(String[] args) {
		/*
		 while��
		 
		 ���������� �ٱ�
		 
		 while (���ȳ���?) {
		 	�پ�
		}
		
		������ ���ε��� ������ �ݺ������� ����
		������ ��, ������ �Ǻ��� �� �ִ� ���ǽ��� ��
		�ݺ��� ���� �� �ֵ��� ���ǽ��� ���� �ٲ�ΰ� ���� - > �׷��� ������ ���ѷ����� ����
		�ʿ��� ��찡 �ƴ϶�� ���� ������ �������ʰ� ����
		*/
		 
		/*
		int i = 0;
		while (i < 5 ) {
			System.out.println("����" + i);
			i++;
		}
		*/
		
		//while���� �̿��ؼ� ������ ����ϱ�
		//����� �������� �ܼ��� ����ڿ��� �Է¹ޱ�
		
		/*
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while (i < 10 ) {
			i++;
			System.out.println(num+" * "+i+" = "+num * i);
		}
		*/
		
		
		//���� n�� ����ڿ��� �Է¹ް�
		//n���� �۰� 10���� ���� ������ ��� ���� ���Ͻÿ�.
		//-------------------------------------------------------------------
	
//		System.out.println("���ڸ� �Է��ϼ���");
//		Scanner nSc = new Scanner(System.in);
//		int n = nSc.nextInt();
//		int number = 0;
//
//		while (n<1) {
//			
//		}
		
//		if(number < n && number % 10== 0) {
//			while (n<1) {
//				
//				System.out.println(number);
//				n--;
//			}
//		}
	
		/*
		 do-while ��
		 ������ ���ε��� �ݺ� ����, ������ ���߿� Ȯ��
		 ������ ��, ������ ������� ������ ������ �ּ��� �ѹ��� �����ؾ��� �� ���
		 */
		/*
		int k = 0;
		do {
			System.out.println("���� : " + k);
			k++;
		}while (k <3);
		*/
		/*
		 ���� ���߱� ���α׷� �ۼ�
		 ���� �̸� ������ ���� (ex) int answer = 59
		 ����ڰ� ���ڸ� �Է��ϸ� ���亸�� ������ ������ �Ǵ��Ͽ� ��� ���
		 ������ ���߸� �õ�Ƚ�� ���
		 do-while�� �̿��ؼ� �ۼ�
		 
		 */
		
		
//		System.out.println("������ ������ ������");
//		Scanner sc2 = new Scanner(System.in);
//		
//		int time = 0;
//		int numm = sc2.nextInt();
//		int answer = 59;
//		
//		
//		do {
//
//			if (numm > answer) {
//				System.out.println("�Է��Ͻ� �� ���� �����ϴ�");
//				time++;
//				break;
//			} else {
//				System.out.println("�Է��Ͻ� �� ���� �����ϴ�");
//				time++;
//				break;
//			}
//		} while (numm != answer) ;
//		
//		System.out.println("�����մϴ�. �õ�Ƚ�� : "+ time);
//		

		
		/*
		 for��
		 
		 �ɾҴ� �Ͼ�� 5�� �ݺ�
		 
		 for (Ƚ���� ���� ���� ����; ���ǽ�; ������){
		 ���๮��
		 }
		 */
		/*
		for (int j = 0; j <5; j++ ) {
			System.out.println("�ɾҴ� �Ͼ�� ");
		}
		*/
		//1���� 10���� ���ؼ� ��� ���
		/*
		int sum = 1 ;
		for (int q = 0; q < 11; q++ ) {
			sum += q;
		}
		
		System.out.println(sum);
		*/
		//2���� for������
		/*
		for (int q = 1; q < 10; q++ ) {
			int p = 2;
			System.out.println(p+" * "+q+" = "+p*q);
		}
		*/
		//2������ for������ 
		
		// 1+1+2+1+2+3+...+10 ��� ���
		/*
		sum = 0;
		int total = 0; 
		for (int q = 0; q < 10; q++) {
		 for (int p =0; p <10; p++) {
			 sum += p;
		 }
		 	total = sum + q; 
		}
		System.out.println(sum);
		*/
		//��ø for�� 
		//�ݺ����ȿ� �ݺ���
		/*
		for(�ʱⰪ1;���ǽ�1;������1) {
			for (�ʱⰪ2;���ǽ�2;������2) {
				����;
			}
			����;
		}
		*/
		/*
		for (int ii = 1; ii <= 10; ii++ ) {
			System.out.println(" �ٱ��� ����"+ ii);
			for(int jj =1; jj <= 10; jj++) {
				System.out.println(" ���� "+ jj);
			}
			System.out.println(" �ٱ��� ��"+ ii);
		}
		*/
		//2~9���� ���� for������ ����
		/*
		for (int ii = 2; ii < 10; ii++ ) {

			for(int jj =1; jj < 10; jj++) {
				System.out.println(ii+"*"+jj+"="+ii*jj);
			}

		}
		*/
		
		//���� 
		//Ʈ�������
		for(int ii = 1; ii < 6; ii++) {
			for(int jj = 0; jj <ii; jj++) {
				System.out.printf("*");
			}
			
			System.out.println("\n");
		}
		

	}

}
