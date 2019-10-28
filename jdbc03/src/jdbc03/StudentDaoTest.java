package jdbc03;

public class StudentDaoTest {
	
public static void main(String[] args) {
	
//	Student s = new Student();

	
//	StudentDao dao = new StudentDao();
//	StudentDao dao2 = new StudentDao();
// ->경우 객체가 두가지가 생성됨	
	
	StudentDao dao = StudentDao.getInstance();
//	StudentDao dao2 = StudentDao.getInstance();
//	->의 경우 객체가 하나면 생성됨
	
	
	/*
	 StudentDAO 클래스의
	 getInstance() 메소드를
	 호출해서 dao 객체 획듣해야함
	 
	 - > getInstance가 일반 메소드면
	 	호출 불가능
	 	
	 - > getIntance를 static
	 
	 
	 */
//	StudentDao dao = new StudentDao();
	
//	dao.InsertStuent(s);
//	dao.UpdateStudent(new Student (1, "한지연", 7));
//	dao.DeleteStudent(1);
//	Student result = dao.SelectOneStudent(s.getStuid());
//	System.out.println(result);
	
//	for (Student st:dao.SelectAllStudent()) {
//		System.out.println(st);
//	}
	
}

}
