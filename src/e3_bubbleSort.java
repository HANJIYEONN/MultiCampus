/*
 ���� : �������� / ������������ �����͸� �����ϴ� ��
 ��������
 
 3 2 5 4 1
 2 3 5 4 1
 2 3 5 4 1
 2 3 4 5 1
 2 3 4 1 5 
 */
public class e3_bubbleSort {

	public static void main(String[] args) {
		int array[] = {3 ,2, 5, 4, 1};
		int temp = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <i; j++) {
				
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			
			}	
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
