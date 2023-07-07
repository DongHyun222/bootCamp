package day_01;

public class ifExam {
	
	public static void main(String[] args) {
		int score = 99;
		if (score >= 90) System.out.println("등급은 A입니다");
		else if (score >= 80) {
			System.out.println("등급은 B입니다");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		System.out.println("End");
		
	}
}
