/*
	 continue
	 �ݺ����� ������ �ߴ��ϰ� ���ǽ����� ��
	 
	 �־��� ���ڿ����� n�� � �ִ��� �˾Ƴ��� ���α׷�
	  
 */
public class p3_continue {

	public static void main(String[] args) {
		String s = "no news is good news";
		int n = 0;
//		//���ڿ��� ����
//		System.out.println(s.length());
//		//0��° ĭ�� ���� ��������
//		System.out.println(s.charAt(0));
		for (int i=0; i < s.length(); i++) {
			if (s.charAt(i) !='n') continue; //continue���� ������ ���������ʰ�
			//���ǹ� �˻�� �ٽ� �Ѿ
			n++;
		}
		System.out.println(n);
	}

}
