package WorkShop_0726;

public class Member {
	private String Memberid, name, password, number;
	
	public Member() {
	}

	public Member(String id, String name, String password, String number) {
		super();
		this.Memberid = id;
		this.name = name;
		this.password = password;
		this.number = number;
	}

	public String getId() {
		return Memberid;
	}
	public void setId(String id) {
		this.Memberid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "id=" + Memberid + ", name=" + name + ", password=" + password + ", number=" + number;
	}
	
	
	
}
