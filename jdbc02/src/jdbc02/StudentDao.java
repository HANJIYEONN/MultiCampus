package jdbc02;
/*
 DAO (Data Access Object)
 
 DB와 연결되어 DB안의 특정 테이블의 데이터를 insert, update, delete, select하는 기능을 수행

 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	
	//연결객체를 필드로 선언
	private Connection conn;
	
	//디비 연결 정보를 상수로 정의
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "multi";
	static final String PASSWORD = "multi1234";
	
	//생성자 : 초기화 - > 객체가 생성될 때 초기화 작업 정의
	public StudentDao() {
		//Connection 객체 획득 -> DB에 연결
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//insert : 데이터 삽입 기능
	/*
		학생정보를 하나 매개변수로 받아서
		student2 테이블에 레코드 삽입
	 */
	public void insertStudent(Student s) {
		/*
		 sql문 준비 : 인자값을 ?로 설정
		 PreparedStatement 참조변수 선언
		 conn로부터 PreparedStatement 객체를 생성
		 인자값맵핑
		 sql 구문 실행
		 PreparedStatement객체 닫기
		 */
		PreparedStatement pstmt = null;
		
		
		String sql  = " INSERT INTO student2 VALUES (?, ?, ?) ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, s.getStuid());
			pstmt.setString(2, s.getSname());
			pstmt.setInt(3, s.getGrade());
			
			pstmt.executeUpdate();
			System.out.println("Insert 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try { 
				if(pstmt != null && !pstmt.isClosed())pstmt.close();
		} catch (SQLException e){
						e.printStackTrace();
					}
		}
		
	}
	
	//delect
	/*
	 학생번호(식별자)를 매개변수로 받아
	 student테이블에서 해당 학생의 레코드를 지움
	 */
	public void delectStudent(int stuid) {
		PreparedStatement pstmt = null;
		
		String sql = " DELETE FROM student2 WHERE stuid = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, stuid);
			
			pstmt.executeUpdate();
			System.out.println("delect완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 

	}
	
	//update
	/*
	 학생정보를 매개변수로 받음
	 학생 번호에 해당하는 레코드 수정
	 */
	public void UpdateStudent(Student s) {
		PreparedStatement pstmt = null;
		
		String sql = " UPDATE student2 SET sname = ?, grade = ? where stuid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
	
			pstmt.setString(1, s.getSname());
			pstmt.setInt(2, s.getGrade());
			pstmt.setInt(3, s.getStuid());
			
			pstmt.executeUpdate();
			
			System.out.println("업데이트 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed())pstmt.close();			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	//select : One
	// 조회 - 한명만 
	/*
	 학생 id에 해당하는 레코드를 DB에서 조회하기
	 학생정보 객체 (Student)에 담아서 리턴
	 
	 */
	public Student selectOneStudent(int stuid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Student student = null;
		
		String sql = " SELECT * FROM student2 WHERE stuid = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt (1, stuid);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				student = new Student(); //sql 실행 결과로 얻어온 레코드를 담을 student객체 생성
				
				student.setStuid(rs.getInt("stuid"));
				student.setSname(rs.getString("sname"));
				student.setGrade(rs.getInt("grade"));
			}
			System.out.println("SELECT완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed())pstmt.close();
				if(rs != null && !rs.isClosed())rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return student;
	}
	
	//select : All
	/*
	  모든 레코드를 조회
	 student2테이블의 레코드 하나 : Student 객체 1개
	 student2테이블의 모든 레코드	-> 레코드들의 목록 : Student객체의 리스트 
	 */
	public List<Student> selectAllStudent() {
		String sql = " SELECT * FROM student2 ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		//학생 정보목록을 담기위한 리스트
		List<Student> studentList = new ArrayList<Student>();

		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Student student = new Student(); //sql 실행 결과로 얻어온 레코드를 담을 student객체 생성
				
				student.setStuid(rs.getInt("stuid"));
				student.setSname(rs.getString("sname"));
				student.setGrade(rs.getInt("grade"));
				studentList.add(student);
			}
			System.out.println("SELECT완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed())pstmt.close();
				if(rs != null && !rs.isClosed())rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return studentList;
	}
}		
