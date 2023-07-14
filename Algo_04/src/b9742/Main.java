package b9742;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static char[] arr;
	static char[] result;
	static ArrayList<String> ans;
	static boolean[] visited;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String s = sc.next();
			arr = s.toCharArray();
			int find_idx = sc.nextInt();
			n = s.length();
			
			int error_ans = 1;
			for (int i = 1; i <= n; i++) {
				error_ans *= i;
			}
			
			if (error_ans < find_idx) {
				System.out.print(arr);
				System.out.println(" " + find_idx + " = " + "No permutation");
			} else {
				result = new char[n];
				ans = new ArrayList<String>();
				visited = new boolean[n];
				
				recur(0,n);
				System.out.print(arr);
				System.out.println(" " + find_idx + " = " +ans.get(find_idx-1));
			}
		}
	}

	private static void recur(int depth, int idx) {
		if (depth == idx) {
			String aaa = new String(result);
			ans.add(aaa);
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(visited[i] == false) {
				visited[i] = true;
				result[depth] = arr[i];
				recur(depth+1,idx);
				visited[i] = false;
			}
		}
	}
}
