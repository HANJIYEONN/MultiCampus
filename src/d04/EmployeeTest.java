package d04;
/*
 Employee 클래스
 추상클래스
 필드 : 이름, 나이, 연봉
 추상메소드 
 pay();
 메소드
 print() : 직원 정보 출력 (예 : [정규직] 홍길동, 23, 3000)
 
 Regular 클래스
 실체클래스
 필드 : 상여급, 월급;
 pay() : 월급에 따른 상여금 계산해서 연봉계산
 250만 이상 : 연봉의 6%
 200만 이상 : 연봉의 5%
 200만 이하 : 연봉의 4%
 
 Temporary 클래스
 실체클래스
 필드 : 근무일수, 하루치 급여
 pay() : 급여 계산
 
 */
public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] e = new Employee[5];
		
		//이름, 나이, 월급
		e[0] = new Regular("홍길동", 20, 3000000);
		e[1] = new Temporary("홍길동", 20, 3000000);
		
		System.out.println();
		System.out.println();
		
//		print() : 직원 정보 출력 (예 :[정규직] 홍길동, 23 300000)
		e[0].print();
//		print() : 직원 정보 출력 (예 :[정규직] 홍길동, 23 300000)
		e[1].print();
	}
}
