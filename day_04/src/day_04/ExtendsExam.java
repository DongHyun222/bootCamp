package day_04;

public class ExtendsExam {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 100;
		B b1 = new B();
		b1.i = 200;
		b1.j = 300;
	}
}
class A{
	int i;	
}
class B extends A{
	int j;
	public void prn() {
		this.i = 500;
	}
}