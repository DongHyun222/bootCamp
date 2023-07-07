package day_05;

public class MemberDto {
	private int mno;
	private String name, tel;
	
	public MemberDto() {
	}

	public MemberDto(int mno, String name, String tel) {
		super();
		this.mno = mno;
		this.name = name;
		this.tel = tel;
	}

	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
}
