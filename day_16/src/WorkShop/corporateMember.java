package WorkShop;

public class corporateMember extends memberType{
	private String corporateName;
	private String corporateNumber;
	
	public corporateMember() {
	}

	public corporateMember(int memberNum, String memberType, String memberPhone, String corporateName, String corporateNumber) {
		super(memberNum, memberType, memberPhone);
		this.corporateName = corporateName;
		this.corporateNumber = corporateNumber;
	}

	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getCorporateNumber() {
		return corporateNumber;
	}
	public void setCorporateNumber(String corporateNumber) {
		this.corporateNumber = corporateNumber;
	}

	@Override
	public String toString() {
		return "corporateMember : "+super.toString()+"[corporateName=" + corporateName + ", corporateNumber=" + corporateNumber + "]";
	}

	
	
}
