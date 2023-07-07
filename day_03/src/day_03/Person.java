package day_03;

public class Person {

	private String name = "가나다";
	private int age;
	
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
	
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(int age,String name) {
		this(name, age);
	}

	/** 내부변수값을 출력 */
	public void printInfo() {
		System.out.println(name + " " + age);
		return;
	}
	
//	String name = "홍길동";
//	int age;
//	//기본생성자를 컴파일러가 추가함
//	
//	//Singleton 패턴에서는 객체를 한개만 만들어야 하므로 public대신 private를 사용
//	
//	public Person(String name, int age) {
//		this.name = name;	//this는 내장필드, 객체마다 가지고 있다
//		this.age = age;
	
}
