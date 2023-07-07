package day_05;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		//회원이름관리
		ArrayList<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("김길동");
		names.add("박길동");
		System.out.println(names);
		names.add(1,"박길동");
		System.out.println(names);
		String n = names.remove(2);		//remove는 pop처럼 지운값을 반환해줌
		System.out.println(n);
		names.clear();
		System.out.println(names);
	}
}
