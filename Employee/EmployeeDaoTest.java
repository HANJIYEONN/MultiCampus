/*
 [문제]
emp3 테이블을 생성하고 수업시간에 활용한 데이터로 초기 insert한 후 다음 내용을 실행한다.

- emp3 테이블을 위한 모델클래스 정의
- emp3 테이블의 데이터를 관리 하기위한 DAO클래스 설계
	
	* DAO클래스 내의 메소드
	* insert
	* update
	* delete
	* selectAll
	* selectOne

- emp3 DAO클래스를 실행하기 위한 TEST클래스
 */
package Employee;

public class EmployeeDaoTest {
	public static void main(String[] args) {
		EmployeeDao dao = EmployeeDao.getInstance();
		Employee employee = new Employee();
		
//		dao.InsertEmployee(new Employee(7777, "HAN", "LUCKYMAN", 7839, null ,9000,700,20 ));
//		dao.UpdateEmployee(new Employee(7777, "HANJI", "LUCKYWOMAN", 7839, null ,9000,900,20));
//		dao.DelectEmployee(7777);
//		Employee result = dao.SelectOneEmployee(employee.getEmpno());
//		System.out.println(result);
//		
		for (Employee ee : dao.SelectAllEmployee()) {
			System.out.println(ee);
		}
	}
}
