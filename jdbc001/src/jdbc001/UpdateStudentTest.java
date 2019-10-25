package jdbc001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 사용자로부터 학생정보를 입력받음
 - 수정할 학생 아이디
 - 수정할 학생 이름
 - 수정할 학생 학년
 */
public class UpdateStudentTest {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		/*
		 dbms 접속을 위한 정보
		 */
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "multi";
		String password = "multi1234";

		//사용자에게 데이터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 학생의 id를 입력하세요");
		int id = sc.nextInt();
		System.out.println("수정할 학생의 name을 입력하세요");
		sc.nextLine(); 
		String name = sc.nextLine();
		System.out.println("수정할 학생의 학년을 입력하세요");
		int grade = sc.nextInt();
		
		
		try {
			Class.forName("oracle:jdbc:driver:OracleDriver");
			System.out.println("연결이 완료 되었습니다.");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			//Connection 객체 획득
			conn = DriverManager.getConnection(url, user, password);
			
			//update 테이블명 set 컬럼명 = 값, 컬럼명 값  WHERE 조건
			String sql = "UPDATE student2 SET sname = ?, grade = ? where stuid = ? ";
			
			//Preparedstatement 객체 사용
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, grade);
			pstmt.setInt(3, id);
			
			pstmt.executeUpdate();
			System.out.println("레코드 삽입 완료");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn != null && !conn.isClosed())conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
