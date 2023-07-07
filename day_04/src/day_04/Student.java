package day_04;

public class Student extends Person{
	private String hakgwa;
	
	public Student() {
		super();
	}

	public Student(String id, String name, String hakgwa) {
//		setId(id);
//		setName(name);
		super(id, name);
		this.hakgwa = hakgwa;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + "hakgwa=" + hakgwa;
	}
	
}
