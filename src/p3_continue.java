/*
	 continue
	 반복문의 실행을 중단하고 조건식으로 감
	 
	 주어진 문자열에서 n이 몇개 있는지 알아내는 프로그램
	  
 */
public class p3_continue {

	public static void main(String[] args) {
		String s = "no news is good news";
		int n = 0;
//		//문자열의 길이
//		System.out.println(s.length());
//		//0번째 칸의 문자 가져오기
//		System.out.println(s.charAt(0));
		for (int i=0; i < s.length(); i++) {
			if (s.charAt(i) !='n') continue; //continue뒤의 내용은 실행하지않고
			//조건문 검사로 다시 넘어감
			n++;
		}
		System.out.println(n);
	}

}
