package day_17;

public class Review03 {
	
	int i = 100;
	final int a = 300;
	static int j = 200;
	{
		//초기화블록
	}
	public Review03() {
		this.i = 300;
//		this.a = 111; 오류
		j = 300;
	}
	static {
		//static 초기화블록
	}
	
	public static void main(String[] args) {
		System.out.println(j);
		System.out.println(Review03.j);
		System.out.println(Math.PI);
	}
	
	static void a(int a) {}
//	static void a(int b) {} //오류
	static void a(int a, int b) {} 
}
