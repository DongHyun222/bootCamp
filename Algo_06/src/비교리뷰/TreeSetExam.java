package 비교리뷰;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(30);		//그냥 정렬해줌
		ts.add(100);
		ts.add(200);
		ArrayList<Integer> arr = new ArrayList<Integer>(ts);
		System.out.println(arr);
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(30);		//해쉬셋은 정렬할때 앞자리만 보고 정렬하기 때문에 맨뒤로감
		hs.add(100);
		hs.add(200);
		arr = new ArrayList<Integer>(hs);
		System.out.println(arr);
		
		System.out.println(true&&false||true&&true);
		String[] asd = {"asd", "/", "123"};

		System.out.println(asd[1].charAt(0)<'0');
	}
}
