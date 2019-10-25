package jdbc001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 DBMS 안의 특정 DB와의 연결을 가지는 Connection 객체 획득
 내가 질의할 sql 문을 담을 Statement 객체 생성
 connection 객체에 Statement 객체 전달
 */
public class CreateTableTest {
	public static void main(String[] args) {
		//DBMS 안에 틎겅 DB와의 연결을 가지는 Connection 객체 획득
		Connection conn = null;
		Statement stmt = null;
		/*
		 jdbc:oracle:thin:@localhost:1521:orcl
		 */
		// xe는 sql developer에서 새로운거 만들때 확인 가능
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username ="multi";
		String pwd = "multi1234";
		
		//ojdbc에서 클래서 가져오는 거임
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
		try {
			conn = DriverManager.getConnection(url, username, pwd);
			
			//sql문을 날릴 conn 객체의 기능을 호출해서 statement 객체저장
			stmt = conn.createStatement();
			
			// dbms에 연결 요청 -> 연결이 되면 -> Connection 객체 리턴 -> 참조 변수에 저장
			
			/*
			 create table student2(
			 	stuid number(2),
			 	sname varchar2(10),
			 	grade number(3)
			 );
			 */
			StringBuilder sb = new StringBuilder();
			String sql = sb.append(" create table student3( ")
							.append(" stuid number(2), ")
							.append(" sname varchar2(10), ")
							.append(" grade number(3) ")
							.append(" ) ")
							.toString();
			//Statement 객체의 execute메소드를 이용해서 sql문 실행
			/*
			 Statement 객체의 메소드
				 execute 		: 테이블의 생성, 수정, 삭제 등 데이터베이스 관리 명령
				 executeUpdate 	: 레코드를 삽입, 수정, 삭제 등등 데이터베이스를 조작하는 명령
				 executeQuery 	: 레코드 조회, 테이블 조회등의 명령 
			 */
			stmt.execute(sql);
							
		} catch (Exception e) {
			e.printStackTrace();
			
			//finally : 예외가 발생하던 발생하지 않던 실행되어야하는 블록
		} finally {
			//Connection 객체 닫기
			try {
				//if문 내용 : 만약 연결(connection)이 되어있다면 ~~ 해라(지금 상황에서는 conn.close : connection을 끊어라)
				if (conn != null && !conn.isClosed())conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	}

}
