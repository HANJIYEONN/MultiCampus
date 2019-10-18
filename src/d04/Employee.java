package d04;
/*
  Employee 클래스
 추상클래스
 필드 : 이름, 나이, 연봉
 추상메소드 
 pay();
 메소드
 print() : 직원 정보 출력 (예 : [정규직] 홍길동, 23, 3000)
 
 */
public abstract class Employee  {
	String name;
	int age;
	int salary;
	
	abstract public void pay();
	public void print(String name, int age, int salary) {
	}

}
