
public class p4_Lotto {

	public static void main(String[] args) {
		/*
		 6ĭ¥�� �迭�� �����ϰ� �ζ� ��ȣ ������ �����
		 1~45���� ���� ����
		 Math�� ������ ����� ������ -> ���� ���� ���
		 �ߺ� ��� - > +@�ߺ� ����
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
//			���๮��;
//		}
		
	}

}
