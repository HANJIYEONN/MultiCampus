package d04_02;
/*
 Employee 클래스를 만들고
 이름 (String), 연봉(int) 정보를 담는 필드 정의
 
 직원 3명 만들고
 직원수를 저장하기 위한 정적 필드 
 현재직원수를 출력하기 위한 정적메소드 만들기
 */

class Employee {
	private String name;
	private int salary;
	
	private static int count = 0;
	
	public static int getCount() {
		return count;
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		count++;
	}
	
}


public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("이네모", 1000000);
		e2 = new Employee("김네모", 3000000);
		e3 = new Employee("한네모", 9999999);
		System.out.println(Employee.getCount());
	}
}
