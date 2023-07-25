package day_17;

import java.util.Random;

public class RandomExam {
	public static void main(String[] args) {
		Random r = new Random();
		int ri = r.nextInt(44)+1;
		System.out.println(ri);
		
		Random s = new Random(500);
		int ss = s.nextInt(44)+1;
		System.out.println(ss);
		
		
	}
}
