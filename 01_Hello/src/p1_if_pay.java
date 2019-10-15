import java.util.Scanner;

//일당 구하기
//시간당 8350원
//하루에 일하는 시간을 입력받기
//8시간 초과 근무시에 초과근무시간의 1.5배 지급
public class p1_if_pay {

	public static void main(String[] args) {
		//사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		
		int hours;
		int pay = 8350;
		

		System.out.println("일하는 시간을 입력하세요");
		hours = sc.nextInt();
		
		int minWages = (int) ((hours < 8) ? hours * pay : (7 * pay) + (hours - 7) * (pay * 1.5 ));
		
		
		
		System.out.println(minWages);
	}

}
