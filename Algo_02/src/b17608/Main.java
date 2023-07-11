package b17608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> s = new Stack<Integer>();
		
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			s.push(x);
		}
		
		int cnt = 0, h = 0;
		for (int i = 0; i < N; i++) {
			int x = s.pop();
			if (x > h) {
				h = x;
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}
}
