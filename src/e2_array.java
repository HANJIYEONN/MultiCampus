import java.util.Scanner;

public class e2_array {
	public static void main(String[] args) {
		//20���� �л� ������ �����ؾ��Ѵٸ�?
		int s1;
		//�츮�� �����ϴ� s1�� �л� ������ �����ϱ� ���Ѻ���
		//s1�� s2�� �������� ����
		//num : ���� �����ϱ� ���� ����
		//s1�̳� num�� ���̰� ���� ����
		
		//�迭
		
		//new : �������� ��ü�� �����ϰ� �ּҸ� ��ȯ
		int[] s = new int[20];	//20 : ����
						// ������ �迭 20ĭ¥���� �����
		//�����迭�� ��ġ�� ������ ����
		
		//�迭�� �����ϴ� ���
		s[0] = 1;
		s[1] = 1;
		s[2] = 1;
		//s1, s2������ ���� - > �׳� ����
		//s[1], s[2] ������ ���� - > �ε����� �����ؼ� �����Ϳ� ������ �� ����
		
		//�迭 ����
		//[] : �迭������ �����ϴ� ��ȣ
		//������ Ÿ�� �ڿ� �� ���� �ְ�, ���� �ڿ� ���� ���� ����
		
		int[] intarr;
		int intarr2[];
	
		double[] dArr;
		String str[];
		
		//�迭�� �� �ֱ�
		//1. ���� ������� �迭 ����
		//������ Ÿ�� [] ���� = {��1, ��2, ��3, ...};
		
		String[] names = {"ȫ�浿", "���ڹ�", "���ڹ�"};
		
		
		//��� ���ϱ�
		int[] scores = {83, 90, 78};
		int avg = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			
			sum += scores[i];
			avg = sum/scores.length;
		}
		System.out.println(avg);
		
		//2. new �����ڷ� �迭����
		//���� ����� ������ ���� ������, ���� ������ ������ �迭�� �̸�����������
		//new �����ڷ� �迭��ü�� ������ �� ����.
		//������ Ÿ��[] ���� = new Ÿ��[����]
		
		//���̰� 5�� int �迭�� �����غ�����
		
		int[] momo = new int[3];
		
		//intArr2[0]~intArr2[4]�� �޸� ������ �̸� Ȯ��
		//�迭�� �����ּ� ����
		//�迭������ ����
		
		//���� 2���� ������ �Է¹޾� ����ϱ� : �迭 
		int[] salary = new int[2];
		System.out.println("������ �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		salary[0] = sc.nextInt();
		salary[1] = sc.nextInt();
		
		System.out.println(salary[0]);
		System.out.println(salary[1]);
	}

}
