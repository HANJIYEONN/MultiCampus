import java.util.Scanner;

public class e2_array {
	public static void main(String[] args) {
		//20명의 학생 정보를 저장해야한다면?
		int s1;
		//우리가 생각하는 s1은 학생 정보를 저잘하기 위한변수
		//s1과 s2는 연관성이 있음
		//num : 수를 저장하기 위한 변수
		//s1이나 num와 차이가 없는 변수
		
		//배열
		
		//new : 힙영역에 객체를 생성하고 주소를 반환
		int[] s = new int[20];	//20 : 길이
						// 정수형 배열 20칸짜리를 만들어
		//정수배열의 위치를 저장할 변수
		
		//배열에 접근하는 방법
		s[0] = 1;
		s[1] = 1;
		s[2] = 1;
		//s1, s2에서의 숫자 - > 그냥 문자
		//s[1], s[2] 에서의 숫자 - > 인덱스를 조절해서 데이터에 접근할 수 있음
		
		//배열 선언
		//[] : 배열변수를 선언하는 기호
		//데어터 타입 뒤에 올 수도 있고, 변수 뒤에 붙을 수도 있음
		
		int[] intarr;
		int intarr2[];
	
		double[] dArr;
		String str[];
		
		//배열에 값 넣기
		//1. 값의 목록으로 배열 생성
		//데이터 타입 [] 변수 = {값1, 값2, 값3, ...};
		
		String[] names = {"홍길동", "김자바", "박자바"};
		
		
		//평균 구하기
		int[] scores = {83, 90, 78};
		int avg = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			
			sum += scores[i];
			avg = sum/scores.length;
		}
		System.out.println(avg);
		
		//2. new 연산자로 배열생성
		//값의 목록을 가지고 있지 않지만, 향후 값들을 저장할 배열을 미리만들고싶을때
		//new 연산자로 배열객체를 생성할 수 있음.
		//데이터 타입[] 변수 = new 타입[길이]
		
		//길이가 5인 int 배열을 생성해보세요
		
		int[] momo = new int[3];
		
		//intArr2[0]~intArr2[4]의 메모리 공간을 미리 확보
		//배열의 생성주소 리턴
		//배열변수에 저장
		
		//직원 2명의 월급을 입력받아 출력하기 : 배열 
		int[] salary = new int[2];
		System.out.println("월급을 입력하시오");
		Scanner sc = new Scanner(System.in);
		salary[0] = sc.nextInt();
		salary[1] = sc.nextInt();
		
		System.out.println(salary[0]);
		System.out.println(salary[1]);
	}

}
