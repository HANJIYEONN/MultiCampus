package jdbc001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*
	조회하고싶은 학생 id를 사용자로부터 입력받고
	그 id에 해당하는 학생의 정보를 입력
	
	sql문 : 	SELECT *
			FROM student2
			WHERE stuid = ?
 */
public class SelectOneStudentTest {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "multi";
		String password = "multi1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 학생의 id를 입력하세요");
		int id = sc.nextInt();
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(" SELECT * "
								+ "			FROM student2 "
								+ "			WHERE stuid = ? ");		
			
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery(); //sql결과를 가져오는 실행 메소드
			
			while(rs.next()) {
				System.out.println(rs.getInt("stuid"));
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getInt("grade"));
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
