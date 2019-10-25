package jdbc001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 사용자로부터 삭제할 학생의 id를 입력받아서
 해당 학생의 레코드를 삭제
 
 delect from 테이블명 where 조건;
 */
public class DeleteStudentTest {
	
	public static void main(String[] args) {
		

	Connection conn = null;
	PreparedStatement pstmt = null;

	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "multi";
	String password = "multi1234";
	
	Scanner sc = new Scanner(System.in);
	System.out.println("삭제할 학생 아이디를 입력하세요");
	int id = sc.nextInt();
	
	
	try {
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement("DELECT FROM STUDENT2 WHERE STUID = ?");
		
		pstmt.setInt(1, id);
		
		pstmt.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	finally {
		try {
			if (conn != null && !conn.isClosed())conn.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

	}
}