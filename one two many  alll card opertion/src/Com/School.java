package Com;

public class School {
	private int Sid= 0;
	private String schoolname = null;
	private String schoolcity= null;
	private int fid;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getSchoolcity() {
		return schoolcity;
	}
	public void setSchoolcity(String schoolcity) {
		this.schoolcity = schoolcity;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}

}