package b1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer sb = new StringBuffer();
		
		int cnt = 1;
		boolean flag = true;
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if (cnt <= num) {
				while (cnt <= num) {
					stack.push(cnt++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				int pp = stack.pop();	
				if (num < pp) {
					System.out.println("NO");
					flag = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		if (flag)
			System.out.println(sb.toString());
	}
}
