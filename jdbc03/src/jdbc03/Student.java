package jdbc03;

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
