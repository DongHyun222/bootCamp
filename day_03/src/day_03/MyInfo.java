package day_03;

public class MyInfo {
	
	private int age;	//범위
	
	//캡슐화를 통해 정보 은닉
	//getter setter를 통해 정보 꺼내오고 바꿈
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	int age2;			//접근제한자 생략시 default라 칭함.
	
}
