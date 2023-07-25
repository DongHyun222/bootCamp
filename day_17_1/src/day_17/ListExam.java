package day_17;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		String[] asd = new String[] {"홍", "김"};
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("홍");
		arr.add("김");
		arr.add("박");
		System.out.println(arr);
		System.out.println(asd);
		arr.add(1, "최");
		System.out.println(arr);
		arr.set(1, "강");
		System.out.println(arr);
		System.out.println(arr.get(2));
		arr.remove(0);
		arr.remove("박");
		System.out.println(arr);
	}
}
