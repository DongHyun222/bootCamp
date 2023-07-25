package day_17;

import java.util.HashMap;

public class MapExam {
	public static void main(String[] args) {
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//		hm.put("홍", 70);
//		hm.put("김", 90);
//		hm.put("박", 60);
//		System.out.println(hm.get("홍"));
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		hash.put("수학", 90);
		hash.put("영어", 80);
		HashMap<String, HashMap<String, Integer>> hash2 = new HashMap<String, HashMap<String,Integer>>();
		hash2.put("홍길동", hash );
		System.out.println(hash2);
		
	}
}
