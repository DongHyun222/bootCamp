import java.util.Iterator;
import java.util.Scanner;

public class BackT_b2661 {
	static int[] lst;
	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		lst = new int[] {1,2,3};
		backtracking("");
		
	}

	private static void backtracking(String str) {
		if (str.length() == N) {
			System.out.println(str);
			System.exit(0);
		}
		
		for (int i : lst) {
			if (can_make(str+i))
				backtracking(str + i);
		}
	}

	private static boolean can_make(String str) {
		for (int i = 1; i <= str.length()/2; i++) {
			String front = str.substring(str.length() - i*2, str.length() - i);
			String back = str.substring(str.length() - i, str.length());
			if (front.equals(back)) return false;
		}
		return true;
	}
}
