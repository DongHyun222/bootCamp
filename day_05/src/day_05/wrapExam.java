package day_05;

import java.util.ArrayList;

public class wrapExam {
	public static void main(String[] args) {
		int i = 5;
		Integer ii = i;		//박싱
		String ss = ii.toString();
		String ss2 = "200";
		int k = Integer.parseInt(ss2);
		
		int j = ii;			//언박싱
		
		ArrayList<Integer> list = new ArrayList<Integer>();	
		list.add( i );
		
	}
	
}
