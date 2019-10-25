package jdbc02;

public class StudentDaoTest {

	public static void main(String[] args) {
		//1, honghong, 5 : 학생객체 생성
		
	//	Student s = new Student(1,"honghong",5);
		Student s = new Student();
		s.setStuid(1);
		s.setSname("히히");
		s.setGrade(4);
		
		//DAO클래스로 객체 생성
		StudentDao dao = new StudentDao();
	//	dao.insertStudent(s);
	//	dao.delectStudent(4);
	//	dao.UpdateStudent(new Student(2, "홍홍", 77));
		Student result = dao.selectOneStudent(2);
		System.out.println(result);
		
		for (Student ss: dao.selectAllStudent()) {
			System.out.println(ss);
		}
	}

}
