import java.util.*;

/* 問題文
3 × 3 のサイズのビンゴカードがあります。上から i 行目、左から j 列目の数は A i , j です。 続けて、 N 個の数 b 1 , b 2 , ⋯ , b N が選ばれます。選ばれた数がビンゴカードの中にあった場合、ビンゴカードのその数に印を付けます。 N 個の数字が選ばれた時点でビンゴが達成されているか、則ち、縦・横・斜めのいずれか 1 列に並んだ 3 つの数の組であって、全てに印の付いているものが存在するかどうかを判定してください。 制約 入力は全て整数 1 ≤ A i , j ≤ 100 A i 1 , j 1 ≠ A i 2 , j 2 ( ( i 1 , j 1 ) ≠ ( i 2 , j 2 ) ) 1 ≤ N ≤ 10 1 ≤ b i ≤ 100 b i ≠ b j ( i ≠ j ) */

public class Main {
    public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
	      for (int i=0; i<3; i++)
	        for (int j=0; j<3; j++)
		          a[i][j] = sc.nextInt();
          int n = sc.nextInt();
	        int b;
	        boolean[][] is = new boolean[3][3];
	        for (int k=0; k<n; k++) {
	             b = sc.nextInt();
	             for (int i=0; i<3; i++) {
		               for (int j=0; j<3; j++) {
		                   if (a[i][j] == b) {
			                      is[i][j] = true;
			                      break;
		                    }
                    }
                 }
              }
	            boolean result = false;
	            if (is[1][1]) {
                  if ((is[0][0] && is[2][2]) || (is[0][1] && is[2][1])
		                  || (is[0][2] && is[2][0]) || (is[1][0] && is[1][2])) {
		                  result = true;
	                   }
	               } else {
	                   if ((is[0][0] && is[0][1] && is[0][2]) ||
		                      (is[0][0] && is[1][0] && is[2][0]) ||
		                      (is[0][2] && is[1][2] && is[2][2]) ||
		                      (is[2][0] && is[2][1] && is[2][2])) {
		                      result = true;
	                      }
	                }
	                 System.out.print(result ? "Yes" : "No");
    }
}
