package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	private Connection conn;
	
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "multi";
	static final String PASSWORD = "multi1234";
	
	/*
	 싱글턴 패턴
	 - 특정 클래스의 객체가 1개만 유지되도록 하는 디자인 패턴
	 - 특정 클래스의 객체가  하나만 만들어지고 어디서든 그 객체에 접근하도록하는 패턴
	 
	 싱글턴 패턴 적용방법
	 	
	 	1. 생성자를 외부에서 호출할 수 없도록 private으로 숨김
	 	2. 객체를 대신 만들어주는 메소드 getInstance() 선언
	 	3. 2의 메소드가 처음 호출되면 새로 만든 객체 반환, 그 다음부터는 만들어진 객체 반환
	 	4. 이미 만들어진 객체를 반환하기 위해서는 객체의 주소를 저장해야함.
	 		-> 필드로 선언
	 	5. 외부에서 객체를 생성하지 않고도 메소드를 호출 할 수 있도록 static 선언	 	
	 
	 */
	
	//staticDao 객체의 참조주소를 저장할 참조변수(필드) 선언
	private static StudentDao instance;
	
	//객체를 대신 만들어 주는 메소드
	public static StudentDao getInstance() {
		if(instance == null) {
			//메소드가 처음 호출되면
			//새롭게 만든 객체 변환
			instance = new StudentDao();
		}

		// 그 다음부터는 만들어진 객체 반환
		return instance;
		
	}
	
	
	// 생성자 : 초기화 -> 객체가 생성될 때 초기 작업을 설정할 수 있음.
	private StudentDao () {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("접속에 성공하였습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void InsertStuent(Student s) {
		PreparedStatement pstmt = null;
		
		String sql = " INSERT INTO student2 VALUES (?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, s.getStuid());
			pstmt.setString( 2, s.getSname());
			pstmt.setInt(3, s.getGrade());
			
			pstmt.executeUpdate();
			System.out.println("Insert 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		
	}

	public void UpdateStudent(Student s) {
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE student2 SET sname = ?, grade = ? where Stuid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getSname());
			pstmt.setInt(2, s.getGrade());
			pstmt.setInt(3, s.getStuid());
			
			pstmt.executeUpdate();
			System.out.println("UPDATE 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	
		
		
		
	}

	public void DeleteStudent(int stuid) {
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM student2 WHERE stuid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, stuid);

			
			pstmt.executeUpdate();
			System.out.println("DELECT 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public Student SelectOneStudent(int stuid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Student student = null;
		
		String sql = "SELECT * FROM student2 WHERE stuid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, stuid);
			
			rs = pstmt.executeQuery();
			
			System.out.println("SELECT ONE 성공");
			
			while(rs.next()) {
				student = new Student();
				
				student.setStuid(rs.getInt("stuid"));
				student.setSname(rs.getString("sname"));
				student.setGrade(rs.getInt("Grade"));
				
			}
			System.out.println("select 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) pstmt.close();
				if (rs != null && !rs.isClosed()) rs.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return student;

	}
	public List<Student> SelectAllStudent() {
		List<Student> arrayList = new ArrayList<Student>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM student2";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			

			while(rs.next()) {
				Student student = new Student();
				
				student.setStuid(rs.getInt("stuid"));
				student.setSname(rs.getString("sname"));
				student.setGrade(rs.getInt("grade"));
				
				arrayList.add(student);
			}
			
			System.out.println("SELECT ALL 성공");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) pstmt.close();
				if(rs != null && !rs.isClosed()) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return arrayList;
	
	}

}
