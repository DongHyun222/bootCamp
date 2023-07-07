package day_01;

public class Variables_01 {

	public static void main(String[] args) {

		int v;
		v = 30;
		int x = 50;
		System.out.println(v+x);
		
		int abc = 65;
		System.out.println(Integer.toBinaryString(abc));
		
		int i2 = 0b100; 	//2진수
		System.out.println(i2);
		
		int i3 = 0100;		//8진수
		System.out.println(i3);
		
		int i4 = 0x100;		//16진수
		System.out.println(i4);
		
		char c1 = '가';
		char c2 = '나';
		System.out.println(c1 < c2);
		int ci1 = c1;
		System.out.println(ci1);
		ci1 ++;
		ci1 ++;
		ci1 ++;
		System.out.println(ci1);
		System.out.println((char)ci1);
		
		boolean b1 = false;
//		String s1 = "abd";
		System.out.println(b1);
		byte bt1 = 100;
		int it1 = bt1;
		bt1 = (byte)it1;
//		가중치가 낮은쪽 LSB, 가중치가 높은쪽 MSB
		System.out.println("**************************");
		
		byte b22 = 10 + 20;
		b22 = (byte)(b22 + 1);
		
		System.out.println(b22);
	}

}
