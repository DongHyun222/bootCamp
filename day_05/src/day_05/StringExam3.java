package day_05;

public class StringExam3 {
	public static void main(String[] args) {
//		StringBuilder : 고속 문자열 처리 객체
		String s = "0123456789";
		String s2 = "";
		
		//실행시간
		long start = System.currentTimeMillis();	
		for (int i = 0; i < 10000; i++) {
			s2 += s;	//매번 새로운 메모리를 사용해서 시간이 오래걸림
		}
		long end = System.currentTimeMillis();		
		System.out.println("실행시간1: " + (end-start));
		
		//
		StringBuffer ssb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		long start2 = System.currentTimeMillis();	
		for (int i = 0; i < 10000; i++) {
			sb.append(s);			
		}
		sb.toString();
		long end2 = System.currentTimeMillis();		
		System.out.println("실행시간2: " + (end2-start2));
		//asdfasdfsadfasdf
		
		
	}
}
