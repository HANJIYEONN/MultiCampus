
public class e4_2d_array {

	public static void main(String[] args) {
		//������ �迭
		//������ Ÿ�� [][] ���� = new ������ Ÿ�� [�����][������];
		
		//2by3ũ���� 2���� ������ �迭 ����
		int array[][] = new int[2][3]; 
		//���� ������� 2���� �迭 ����
		int[][] array2 = {{90,80,70,90},{60,50},{70}};
		
		for (int i = 0; i <array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		//��ü ������ �׸� ���հ� ��հ��� ���ϼ���
		int sum = 0;
		int avg = 0;
		int cnt = 0;
		for (int i = 0; i <array2.length; i++) {
			for (int k = 0; k <array2[i].length; k++) {
				sum += array2[i][k];
				cnt++;
			}
		}
		avg = sum /cnt;
		System.out.println(avg);
		
	}

}
