package 리뷰;

public class AnonymousExam {
	public static void main(String[] args) {
		//일회용 임시 자식클래스를 만드는법
		//{ }는 선언부 역할
		A a = new A() { 
			int j = 100;	// a.j해도 접근못함 왜냐하면 아래보면 A클래스 안에 j가 없기때문
			public void p() {
				System.out.println("B " + j);
			}
		};	
		a.p();
		B b = new B();
		
		System.out.println(a.getClass().getName());	//Anonymous
		System.out.println(b.getClass().getName());
		
		Myswim ms = new Myswim() {
			@Override
			public void swimming() {
				System.out.println("자유형 수영");
			}
		};
		System.out.println(ms.getClass().getName());
	}
}

class A {
	public void p() {
		System.out.println("A");
	}
}

class B extends A{
	@Override
	public void p() {
		System.out.println("B");
	}
}

interface Myswim{
	void swimming();
}

class MyswimImpl implements Myswim {

	@Override
	public void swimming() {
	}
}