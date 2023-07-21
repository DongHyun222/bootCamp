import java.util.Scanner;

public class BackT_s1486 {
    static int N;
    static int B;
    static int ans;
    static int[] lst;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int Test = 1; Test <= T; Test++) {
            N = sc.nextInt();    //점원수
            B = sc.nextInt();    //탑의높이
            ans = Integer.MAX_VALUE; // 최대값으로 초기화
            lst = new int[N];
            visited = new boolean[N];

            for (int i = 0; i < N; i++) {
                lst[i] = sc.nextInt();
            }

            find_ans(0, 0);
            System.out.println("#" + Test + " " + ans); // 각 테스트케이스에 대한 결과 출력
        }
    }

    private static void find_ans(int idx, int cnt) {
        if (cnt >= B) {
            ans = Math.min(ans, cnt - B);
            return;
        }
        if (idx == N) {
            return;
        }
        // idx번째 점원을 선택하는 경우
        visited[idx] = true;
        find_ans(idx + 1, cnt + lst[idx]);
        visited[idx] = false;
        
        // idx번째 점원을 선택하지 않는 경우
        find_ans(idx + 1, cnt);
    }
}
