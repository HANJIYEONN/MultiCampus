package jdbc02;
/*
모델 클래스, DTO, VO

테이블의 구조와 동일한 데이터 타입을 가지는 클래스
이 클래스의 객체는 그 객체를 나타낼수 있는 (레코드하나와 ) 1대1관계


*/
public class Student {
	
	private int stuid;
	private String sname;
	private int grade;
	
	public Student() {};
	
	public Student(int stuid, String sname, int grade) {
		super();
		this.stuid = stuid;
		this.sname = sname;
		this.grade = grade;
	}

	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", sname=" + sname + ", grade=" + grade + "]";
	}
	
	
	

}
