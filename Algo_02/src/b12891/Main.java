package b12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int checkSecret;
	static int myArr[];
	static int checkArr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		char arr[] = new char[S];
		arr = br.readLine().toCharArray();
		
		int ACGT[] = new int[4];
		int checkArr[] = new int[4];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ACGT.length; i++) {
			ACGT[i] = Integer.parseInt(st.nextToken());
			if (ACGT[i] == 0)
				checkSecret += 1;
		}
		
		for (int i = 0; i < P; i++) {
			Add(arr[i]);
		}
		
		if (checkSecret == 4)
			ans += 1;
		
		for (int i = P; i < S; i++) {
			int j = i-P;
			Add(arr[i]);
			Remove(arr[j]);
			if (checkSecret == 4)
				ans += 1;
		}
		System.out.println(ans);
		
	}
	private static void Add(char c) {
		switch (c) {
		case 'A':
			myArr[0] += 1;
			if (myArr[0] == checkArr[0])
				checkSecret += 1;
			break;
		case 'C':
			myArr[1] += 1;
			if (myArr[1] == checkArr[1])
				checkSecret += 1;
			break;
		case 'G':
			myArr[2] += 1;
			if (myArr[2] == checkArr[2])
				checkSecret += 1;
			break;
		case 'T':
			myArr[3] += 1;
			if (myArr[3] == checkArr[3])
				checkSecret += 1;
			break;
		}
	}
	private static void Remove(char c) {
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0])
				checkSecret -= 1;
			myArr[0] -= 1;
			break;
		case 'C':
			if (myArr[1] == checkArr[1])
				checkSecret -= 1;
			myArr[1] -= 1;
			break;
		case 'G':
			if (myArr[2] == checkArr[2])
				checkSecret -= 1;
			myArr[2] -= 1;
			break;
		case 'T':
			if (myArr[3] == checkArr[3])
				checkSecret -= 1;
			myArr[3] -= 1;
			break;
		}
	}
}

