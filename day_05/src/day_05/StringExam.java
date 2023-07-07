package day_05;

public class StringExam {
	public static void main(String[] args) {
		System.out.println('가' < '나');
		System.out.println("ccc".compareTo("abd")); 
		
		System.out.println("*********************");
		//String 비교
		String s1 = "abd";				//"abc"상수는 메서드 영역에 존재
		String s2 = "abd";				//얘는 위에 얘랑 메서드영역에 있는 같은 놈을 가리킴
		String s3 = new String("abd");	//"abc"는 힙에 존재, s3는 스택에 있고 포인터처럼 힙에있는 "abc"를 가리킨다.
		String s4 = new String("abd");
		System.out.println("s1=s2 " + (s1==s2));
		System.out.println("s3=s4 " + (s3==s4));	//s3,s4가 가리키는 힙주소가 다름
		
		//내부 문자열비교
		System.out.println("s3.equals(s4) " + s3.equals(s4));	
		System.out.println("s1.equals(s4) " + s3.equals(s4));	
		
		
	}
}
