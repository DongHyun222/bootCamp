package boj1541;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] lst = input.split("-");
		
		for (int i = 0; i < lst.length; i++) {
			int tmp = mySum(lst[i]);
			if (i==0)
				ans = ans + tmp;
			else
				ans = ans - tmp;
		}
		System.out.println(ans);
	}
	private static int mySum(String string) {
		int sum = 0;
		String temp[] = string.split("[+]");
		for (int i = 0; i < temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum ;
	}
}
