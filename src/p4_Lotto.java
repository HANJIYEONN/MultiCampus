
public class p4_Lotto {

	public static void main(String[] args) {
		/*
		 6칸짜리 배열을 생성하고 로또 번호 생성기 만들기
		 1~45까지 난수 생성
		 Math에 수학적 기능이 모여있음 -> 난수 생성 기능
		 중복 허용 - > +@중복 없이
		 */
//		System.out.println(Math.random());
		//Math.random() : 0 ~ 0.999999
		int lotto[] = new int[6];
		
		for (int i = 0; i < lotto.length; i++ ) {
			lotto[i] = (int) ((Math.random() * 45)+1);
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}

		}
		for (int i : lotto) {
			System.out.println(i);
		}
		
		///forEach
//		for(int n : num) {
//			실행문장;
//		}
		
	}

}
