package day_04;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionExam {
	public static void main(String[] args) {
		//로또번호 생성기
		//List타입
		
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		HashSet<Integer> lottoset = new HashSet<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int r = (int)(Math.random() * 45 + 1);
			lottoset.add(r);
//			if (lottoList.contains(r)) 
//				continue;
			lottoList.add(r);			
		}
		System.out.println(lottoList);
		System.out.println(lottoset);
		System.out.println(lottoList.get(0));
		System.out.println(lottoList.size());
		System.out.println(lottoset.size());
		
	}
}
