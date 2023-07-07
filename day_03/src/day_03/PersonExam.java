package day_03;

public class PersonExam {
	public static void main(String[] args) {
		
//		String name;				//name은 필드, 객체 생성할 때 객체 영역에 생성
		
//		Person p1 = new Person();	//p1은 로컬변수, 얘네는 stack안에 들어감(메서드 코드 실행할 때)
//		Person p2 = new Person();	//메서드 종료하면 삭제됨 -> 결국 로컬변수는 일회용, 임시변수임
//		p1.name = "김길동";
//		p1.age = 33;
		Person p1 = new Person();
		p1.printInfo();
		
		
		Person p2 = new Person("박길동", 35);
		p2.printInfo();
		
		Person p3 = new Person(35,"강길동");
		p3.printInfo();
		
	}
}
