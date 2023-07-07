package day_05;

import java.util.Arrays;

import day_05.MyMember;

public class CompareExam {
	public static void main(String[] args) {
		MyMember[] mems = new MyMember[4];		//new로 만든건 다 객체임
		int count = 0;	//객체 저장할 위치 -> 저장갯수
		mems[count++] = new MyMember("홍길동", 23);
		mems[count++] = new MyMember("홍길동", 23);
		mems[count++] = new MyMember("김길동", 30);
		mems[count++] = new MyMember("박길동", 45);
		
		Arrays.sort(mems,new NameCompararator());
		
		System.out.println("***목록***");
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
		
		System.out.println("mems[2] == mems[3] " + (mems[2] == mems[3]));
		System.out.println("mems[2].equals(mems[3]) " + (mems[2].equals(mems[3])));
	}
}
