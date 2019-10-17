/*
 정렬 : 오름차순 / 내림차순으로 데이터를 나열하는 것
 버블정렬
 
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
		
		for (int i = 0; i < array.length-1; i++) {		
				if (array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
	}
}
