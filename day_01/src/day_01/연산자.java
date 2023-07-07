package day_01;

public class 연산자 {

	public static void main(String[] args) {
		int a = 1;
		int b = a++ + ++a + ++a + a++;
		System.out.println(a);
		System.out.println(b);
		
	}

}
