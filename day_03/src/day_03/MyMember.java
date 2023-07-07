package day_03;

/** 회원정보 정의 클래스 */
public class MyMember {
	private String name;
	private int age;
	private String tel;

	//생성자 - 1. 기본 생성자, 2. 모든 변수를 매개변수로 받는 생성
	public MyMember() {
	}

	public MyMember(String name, int age, String tel) {
		super();	//부모클래스 생성자를 부름, 근데 생략 가능
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	//GetterSetter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

//	현재 객체의 변수값을 문자열로 반환하는 메서드(제대로 했는지 디버깅하기위한)
	@Override
	public String toString() {
		return "MyMember [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	
	
	
}
