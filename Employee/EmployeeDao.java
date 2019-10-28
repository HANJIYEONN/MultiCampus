package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	private static EmployeeDao instance;
	private Connection conn = null;
	
	String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	String USER = "multi";
	String PASSWORD = "multi1234";
	
	public static EmployeeDao getInstance () {
		if (instance == null) {
			instance = new EmployeeDao();
		}
		return instance;
	}
	public EmployeeDao() {
		try {
			DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("연결에 성공하였습니다.!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void InsertEmployee(Employee e) {
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO emp3 VALUES (?,?,?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, e.getEmpno());
			pstmt.setString(2, e.getEname());
			pstmt.setString(3, e.getJob());
			pstmt.setInt(4, e.getMgr());
			pstmt.setDate(5, e.getHiredate());
			pstmt.setInt(6, e.getSal());
			pstmt.setInt(7, e.getComm());
			pstmt.setInt(8, e.getDeptno());
			
			pstmt.executeUpdate();
			System.out.println("INSERT 완료되었습니다");
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if( pstmt != null && !pstmt.isClosed()) pstmt.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	public void UpdateEmployee(Employee e) {
		PreparedStatement pstmt = null;

		String sql = "UPDATE emp3 SET ename = ? , job = ?, mgr = ?, hiredate = ?, sal = ?, comm = ?, deptno = ? WHERE empno = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, e.getEname());
			pstmt.setString(2, e.getJob());
			pstmt.setInt(3, e.getMgr());
			pstmt.setDate(4, e.getHiredate());
			pstmt.setInt(5, e.getSal());
			pstmt.setInt(6, e.getComm());
			pstmt.setInt(7, e.getDeptno());
			pstmt.setInt(8, e.getEmpno());
			
			pstmt.executeUpdate();
			System.out.println("UPDATE완료되었습니다");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	finally {
			try {
				if( pstmt != null && !pstmt.isClosed()) pstmt.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	public void DelectEmployee(int empno) {
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM emp3 WHERE empno = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, empno);
			pstmt.executeUpdate();
			
			System.out.println("DELECT 완료 되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if( pstmt != null && !pstmt.isClosed()) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public Employee SelectOneEmployee(int empno) {
		Employee employee = new Employee();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM emp3 WHERE empno = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				employee = new Employee();
				
				employee.setEmpno(rs.getInt("empno"));
				employee.setEname(rs.getString("ename"));
				employee.setJob(rs.getString("job"));
				employee.setMgr(rs.getInt("mgr"));
				employee.setHiredate(rs.getDate("hiredate"));
				employee.setSal(rs.getInt("sal"));
				employee.setComm(rs.getInt("comm"));
				employee.setDeptno(rs.getInt("deptno"));
				
			}
			System.out.println("SELECT ONE 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if( pstmt != null && !pstmt.isClosed()) pstmt.close();
				if( rs != null && !rs.isClosed()) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return employee;
	}
	public List<Employee> SelectAllEmployee() {
		List<Employee> employeeList = new ArrayList<Employee>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Employee employee;
		
		String sql = " SELECT * FROM emp3 ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				employee = new Employee();
				
				employee.setEmpno(rs.getInt("empno"));
				employee.setEname(rs.getString("ename"));
				employee.setJob(rs.getString("job"));
				employee.setMgr(rs.getInt("mgr"));
				employee.setHiredate(rs.getDate("hiredate"));
				employee.setSal(rs.getInt("sal"));
				employee.setComm(rs.getInt("comm"));
				employee.setDeptno(rs.getInt("deptno"));
				
				employeeList.add(employee);
				
			}
			System.out.println("SELECT ALL성공하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if( pstmt != null && !pstmt.isClosed()) pstmt.close();
				if( rs != null && !rs.isClosed()) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return employeeList;
	}
	


}
