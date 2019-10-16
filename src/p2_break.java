import java.util.Scanner;

/*
 break
 반복문의 실행을 중단하고 반복문을 빠져나감
 
 사용자에게 성적을 입력받아서 평균을 구하는 프로그램
 사용자가 음수값을 입력할 때까지 점수를 반복적으로 입력받음
 음수가 입력되면 반복을 멈추고 그때까지 사용자가 입력한 점수의 평균을 구함
 */
public class p2_break {

	public static void main(String[] args) {
		Scanner  sc =  new Scanner(System.in);
		int total = 0;
		int avg = 0;
		int score = sc.nextInt();
		
		while (score < 0 ) {
			
			for (int ii = 0; ii < score; ii++)
				total = score;
			//특정한 조건이 되면 반복문을 빠져나가도록 설계
			break;
		}
		
	}

}
