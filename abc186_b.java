import java.util.*;

/* 問題文
縦 H マス、横 W マスのマス目があります。
上から i 行目、左から j 列目のマスには、ブロックが Ai,j 個あります。
どのマスにも同じ個数のブロックがある状態にするには、
最小で何個のブロックを取り除けばよいでしょうか？
制約
1≤H,W≤100
0≤Ai,j≤100
javac -encoding utf-8 Main.java  */

public class abc186_b {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
    // 最小値に合わせる
		int min = 100;
		int sum = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int a = sc.nextInt();
				min = Math.min(min, a);
				sum += a;
			}
		}

		System.out.println(sum - min * h * w);
	}
}
