
public class p5_zigzag {

	public static void main(String[] args) {
		/*
		 1	2	3	4	5
		 10	9	8	7	6
		 11	12	13	14	15
		 20	19	18	17	16
		 21	22	23	24	25
		 */
		
		// [1][2] 1%2==0 일때 증감 ㅇ로 나뉘자
		
		int arr[][] = new int[5][5];
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++ ) {
					num++;
					arr[i][j] = num;
				}
			} else {
				for (int j = 4; j >= 0; j-- ) {
					num++;
					arr[i][j] = num;
				}
				
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++ ) {
				System.out.print(arr[i][j]+" "
						);
			}
				System.out.println();
		}


	}

}
