package s1232;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Solution {
	static class Node{
		int value;	//노드값
		char opr;	//노드 연산자
		int left, right;	//자식노드번호
		
		public Node(int value, char opr, int left, int right) {
			super();
			this.value = value;
			this.opr = opr;
			this.left = left;
			this.right = right;
		}
		
		public Node(int value) {
			this(value, '\0',0,0);
		}
		
	}
	static int N;
	static int result;
	static Node[] nodes;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		N = 5;
//		nodes = new Node[N+1];
//		nodes[1] = new Node(0, '-', 2, 3);
//		nodes[2] = new Node(0, '-', 4, 5);
//		nodes[3] = new Node(10);
//		nodes[4] = new Node(88);
//		nodes[5] = new Node(65);
//		
//		int ans = calc(nodes[2]);
		
		for (int T = 1; T <= 10; T++) {
			int N = Integer.parseInt(br.readLine());
			nodes = new Node[N+1];
			for (int i = 1; i <= N; i++) {
				String[] str = br.readLine().split(" ");
				if (str.length >= 3) {
					int idx = Integer.parseInt(str[0]);
					int left_idx = Integer.parseInt(str[2]);
					int right_idx = Integer.parseInt(str[3]);
					nodes[i] = new Node(idx, str[1].charAt(0), left_idx, right_idx);
				} else {
					nodes[i] = new Node(Integer.parseInt(str[1]));
				}
			}
			int ans = calc(nodes[1]);
			System.out.println("#"+T+" " + ans);
		}
	}

	private static int calc(Node node) {
		//연산자 추출
		char opr = node.opr;
		if (opr == '-') {
			return calc(nodes[node.left]) - calc(nodes[node.right]);
		} else if (opr == '+') {
			return calc(nodes[node.left]) + calc(nodes[node.right]);
		} else if (opr == '*') {
			return calc(nodes[node.left]) * calc(nodes[node.right]);
		} else if (opr == '/') {
			return calc(nodes[node.left]) / calc(nodes[node.right]);
		} else {
			return node.value;
		}
	}
}
