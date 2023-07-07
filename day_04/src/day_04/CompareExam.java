package day_04;

import java.util.Arrays;

public class CompareExam {
	public static void main(String[] args) {
		MyMember[] mems = new MyMember[3];		//new로 만든건 다 객체임
		int count = 0;	//객체 저장할 위치 -> 저장갯수
		mems[count++] = new MyMember("고길동", 30);
		mems[count++] = new MyMember("김길동", 23);
		mems[count++] = new MyMember("박길동", 45);
		
		Arrays.sort(mems);
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
	}
}
