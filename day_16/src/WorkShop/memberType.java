package WorkShop;

public class memberType {
	private int memberNum;
	private String memberType;
	private String memberPhone;
	
	public memberType() {
	}

	public memberType(int memberNum, String memberType, String memberPhone) {
		super();
		this.memberNum = memberNum;
		this.memberType = memberType;
		this.memberPhone = memberPhone;
	}

	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	@Override
	public String toString() {
		return "[memberNum=" + memberNum + ", memberType=" + memberType + ", memberPhone=" + memberPhone
				+ "]";
	}
	
}
