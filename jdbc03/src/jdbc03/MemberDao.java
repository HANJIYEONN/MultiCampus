package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.crypto.Data;

public class MemberDao {
	
	private static MemberDao instance;
	String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	String USER = "multi";
	String PASSWORD = "multi1234";
	private Connection conn = null;
	
	
	public static MemberDao getInstance () {
		if (instance == null) {
			instance = new MemberDao();
		} 
		return instance;
		
	}
	public MemberDao () {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("연결에 성공하였습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Member SelectOneMember(String mid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Member member = null;
		
		String sql = " SELECT * FROM member WHERE mid = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			pstmt.setString(1, mid);
			
			while (rs.next()) {
				member = new Member();
				
				member.setMid(rs.getString("mid"));
				member.setMpw(rs.getString("mpw"));
				member.setMname(rs.getString("mname"));
				member.setMemail(rs.getString("memail"));
				member.setMregdate((Data) rs.getDate("mregdate"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed())pstmt.close();
				if(rs != null && !rs.isClosed())rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} 
	
		return member;
	}
	/*
	 id에 해당하는 비밀번호를 조회하는 메소드
	 	
	 	memberService로부터 id를 매개변수로 받아
	 	id에 해당하는 pw를 db에 조회
	 	String문자열에 저장해서 리턴
	 	
	 */
	
	public String selectMemberPwById(String id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Member member =null;
		String pw = null;
		
		String sql = "SELECT mpw FROM member where mid = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pw = rs.getString("mpw");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed())pstmt.close();
				if(rs != null && !rs.isClosed())rs.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return pw;
	}
	public void insertMember(Member m) {
		String sql = "INSERT INTO member VALUES(?,?,?,?, default)";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getMid());
			pstmt.setString(2, m.getMpw());
			pstmt.setString(3, m.getMname());
			pstmt.setString(4, m.getMemail());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed())pstmt.close();
				if(rs != null && !rs.isClosed())rs.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
//	public Int selectMemberById(String mid) {
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		Member member =null;
//		
//		String sql = "Select mid FROM member WHERE pid= ?";
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			pstmt.setString(1, mid);
//			
//			while(rs.next()) {
//				member = new Member();
//				
//				member.setMid(rs.getString("mid"));
//				member.setMpw(rs.getString("mpw"));
//				member.setMname(rs.getString("mname"));
//				member.setMemail(rs.getString("memail"));
//				member.setMregdate((Data) rs.getDate("mregdate"));
//				
//			}
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return 0;
//	}

}
