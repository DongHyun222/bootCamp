package WorkShop;

public class individualMember extends memberType{
	
	private String individualName;
	
	public individualMember() {
	}

	public individualMember(int memberNum, String memberType, String memberPhone,String individualName) {
		super(memberNum, memberType, memberPhone);
		this.individualName = individualName;
	}

	public String getIndividualName() {
		return individualName;
	}
	public void setIndividualName(String individualName) {
		this.individualName = individualName;
	}

	@Override
	public String toString() {
		return "individualMember : "+super.toString()+"[individualName=" + individualName + "]";
	}
	
}
