package 재귀리뷰;

//중복배제
public class 경우의수4_부분집합 {
    static int[] arr ; //원소
    static boolean[] visited;//사용여부
    static int n ; //답의 길이
    static int[] result; //답저장배열
    
    public static void main(String[] args) {
        arr = new int[]{1, 2, 3};
        n = 3;
        visited = new boolean[n];
//        powerSet(0);
//        System.out.println(1<<3);
        bit();
    }

    static void powerSet(int depth) {
        if (depth == n) {
            printResult();
            return;
        }

        visited[depth] = false;
        powerSet(depth + 1);

        visited[depth] = true;
        powerSet(depth + 1);
    }

    static void bit() {		//1 << n(3) 의 값은 1000이므로 8이됨
        for (int i = 1; i < 1 << n; i++) {
//        	System.out.print("i="+i+ " ");
            for (int j = 0; j < n; j++) {
            			//j가 가르키는 것은 추출할 자리인가
                if ((i & 1 << j) != 0)
//                	System.out.println((i & 1 << j));
                    System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    static void printResult() {
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

