package day_01;

public class SwitchExam {
	
	public static void main(String[] args) {

		//가위바위보 컴퓨터 정하기 (0,1,2)
		double d = Math.random();
		d *= 3;
		int i = (int)d;
		System.out.println(d);
		System.out.println(i);
		
		if (i == 0) {
			System.out.println("가위");
		} else if (i == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
//		int lotto에 1~45사이 로또번호 저장 코드 작성
		double l = Math.random();
		int lotto = (int)(l * 45) + 1;
		System.out.println(lotto);
		
		System.out.println("*****************");
		System.out.println(i);
		switch (i) {
		case 0:
			System.out.println("가위");
//			break;
		case 1:
			System.out.println("바위");
//			break;
		case 2:
			System.out.println("보");
//			break;
		default:
//			break;
		}
		
		
		
	}
}
