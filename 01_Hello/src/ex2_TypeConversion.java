//형변환 :  어떤 자료형의 값을 다른 자료형의 값로 바꿔주는 연산
public class ex2_TypeConversion {

	public static void main(String[] args) {
		int i;
		double f;
		
		f = (double)5/4;
		//연산결과 1.25인데 정수 연산이므로 소수점 이하 무시
		//이후 실수 자료형에 담았기때문에 출력은 1.0으로 나옴
		System.out.println(f);
		//원래 정수형 데이터를 double로 형변환하여 실수형이 됨
		//정수형과 실수형의 연산에서는 더 큰 자료형을 따름 
		//그러므로 연산결과 1.25기 됨
		
		i = (int) (1.8 + 1.3);
		System.out.println(i);
		//형변환 데이터시 
	}
}
