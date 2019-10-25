package jdbc001;
/*
	student2 테이블에 있는 모든 레코드 조회하는 프로그램
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllStudentTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //sql 실행 결과를 답기위한 객체
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "multi";
		String password = "multi1234";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(		" SELECT * "
									+ 	" FROM student2 ");
			
			while(rs.next()) {
				System.out.println("id : " + rs.getInt(1));
				System.err.println("name : " + rs.getString(2));
				System.out.println("passward" + rs.getInt(3));
				System.out.println("---------------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try { if(conn != null && !conn.isClosed())conn.close();
			
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
	}

}
