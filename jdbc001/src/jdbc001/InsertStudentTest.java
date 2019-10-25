package jdbc001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/*
 테이블 : student2
 
 Connection 객체 획득
 Statement 객체획득
 sql문 준비 : student2 테이블에 레코드를 추가하기 위한 sql문
 INSERT INTO student2 VALUES ('hey','Insa', 3)
 Statement의 executeUpdate를 이용해서 sql문 질의
 Connection 객체 닫기
 */
public class InsertStudentTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "multi";
		String password = "multi1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
							
			System.out.println("연결에 성공하였습니다");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 id을 출력하세요");
		int id = sc.nextInt();
		System.out.println("학생의 name을 출력하세요");
		sc.nextLine(); 
		String name = sc.nextLine();
		System.out.println("학생의 학년을 출력하세요");
		int grade = sc.nextInt();
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			//stmt = conn.createStatement();
			
			String sql = " INSERT INTO student2 VALUES (?,?,?)";
								
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, grade);
			
			
			pstmt.executeUpdate();
			System.out.println("레코드 삽입 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(conn != null && !conn.isClosed())conn.close();
				
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		
		
	}
}
