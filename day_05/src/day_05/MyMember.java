package day_05;

import java.util.Objects;

public class MyMember implements Comparable<MyMember>{
	private String name;
	private int age;
	
	//생성자를 2개, 기본생성자, 모든 변수를 받는 생성자
	public MyMember() {
	}

	public MyMember(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//Getter, Setter : private되어있는 변수를 가져오고,수정하기 위해 사용
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
	
	// toString() 변수의 현재값을 문자열로 바꿔줌
	@Override
	public String toString() {
		return "MyMember [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(MyMember o) {
		//나이기준정렬
		//양수가 반환되면 뒷순서, 음수가 반환되면 앞순서로 반환됨
		return this.age - o.getAge();
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyMember other = (MyMember) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
	
}
