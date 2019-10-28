package jdbc03;

import java.sql.Date;

import javax.xml.crypto.Data;

public class Member {
	private String mid;
	private String mpw;
	private String mname;
	private String memail;
	private Data mregdate;
	
	public Member() {};

	public Member(String mid, String mpw, String mname, String memail, Data mregdate) {
		super();
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.memail = memail;
		this.mregdate = mregdate;
	}

	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public Data getMregdate() {
		return mregdate;
	}
	public void setMregdate(Data mregdate) {
		this.mregdate = mregdate;
	}
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", mpw=" + mpw + ", mname=" + mname + ", memail=" + memail + ", mregdate="
				+ mregdate + "]";
	}



	
	
}
