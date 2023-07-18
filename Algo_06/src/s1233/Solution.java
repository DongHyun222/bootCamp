package s1233;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution
{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n = Integer.parseInt(br.readLine());
			int ans = 1;
			
			for (int i = 1; i <= n; i++) {
				String[] nd = br.readLine().split(" ");
				if (nd.length >= 3 && nd[1].charAt(0) >= '0' || nd.length == 2 && nd[1].charAt(0) < '0') {
					for (int j = i+1; j <= n; j++) {
						br.readLine();
					}
					ans = 0;
					break;
				}
			}
			System.out.println("#" + test_case + " " + ans);
		}
	}
}