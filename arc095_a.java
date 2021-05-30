import java.util.*;

/* 問題文
l が奇数のとき，l 個の数 a1,a2,...,al の中央値とは，
a1,a2,...,al の中で (l+1)/2 番目に大きい値のことを言います．
N 個の数 X1,X2,...,XN が与えられます．
ここで，N は偶数です． i=1,2,...,N に対して，X1,X2,...,XN から Xi のみを除いたもの，
すなわち X1,X2,...,Xi−1,Xi+1,...,XN の中央値を Bi とします．
i=1,2,...,N に対して，Bi を求めてください．
制約
・2≤N≤200000
・N は偶数
・1≤Xi≤10^9
・入力はすべて整数
javac -encoding utf-8 Main.java */

class arc095_a{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n + 1], srt[] = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
			srt[i] = arr[i];
		}
		Arrays.sort(srt);
		for (int i = 1; i <= n; i++) {
			System.out.println(srt[n / 2 + (arr[i] >= srt[n / 2 + 1] ? 0 : 1)]);
		}
	}

}
