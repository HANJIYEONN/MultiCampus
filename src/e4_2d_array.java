
public class e4_2d_array {

	public static void main(String[] args) {
		//이차원 배열
		//데이터 타입 [][] 변수 = new 데이터 타입 [행길이][열길이];
		
		//2by3크기의 2차원 정수형 배열 선언
		int array[][] = new int[2][3]; 
		//값의 목록으로 2차원 배열 생성
		int[][] array2 = {{90,80,70,90},{60,50},{70}};
		
		for (int i = 0; i <array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		//정체 성적의 항목 총합과 평균값을 구하세요
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
