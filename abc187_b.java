import java.util.Arrays;
import java.util.Scanner;

// xy 平面上に 1,2,…,N の番号が付けられた N 個の点があります。
// 点 i は (xi,yi) にあり、N 個の点の x 座標は互いに異なります。
// 以下の条件を満たす整数の組 (i,j) (i<j) の個数を求めてください。
// 点 i と点 j を通る直線の傾きが −1 以上 1 以下である。
// 制約
// 入力は全て整数
// 1≤N≤103
// |xi|,|yi|≤103
// i≠j ならば xi≠xj

public class abc187_b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			sc.nextLine();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				double ktmk = (double)(y[j] - y[i]) / (double)(x[j] - x[i]);
				if (ktmk >= -1 && ktmk <= 1) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
  }
