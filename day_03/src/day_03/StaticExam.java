package day_03;

public class StaticExam {
	int age = 0;
	
	public static void main(String[] args) {
		new StaticExam().age = 100;
//		age = 100; //int앞에 static 안붙이면 안됨
		test1();
	}
	static void test1() {
		
	}
	
}
