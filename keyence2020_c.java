import java.util.*;

/* 問題文
問題文
3 つの整数 N, K, S が与えられます。
1 以上 109 以下の整数からなる長さ N の数列 A1,A2,...,AN であって、
以下の条件を満たすものをひとつ求めてください。
なお、制約の項で記述される条件のもとで、このような数列は必ず存在することが証明できます。
1≤l≤r≤N を満たす整数の組 (l,r) であって、
 Al+Al+1+⋯+Ar=S を満たすものはちょうど K 個ある。
制約
1≤N≤105
0≤K≤N
1≤S≤109
入力値はすべて整数である。
javac -encoding utf-8 Main.java */

class keyence2020_c{
  public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int s = Integer.parseInt(sc.next());

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append((i < k) ? s : (s + 1) % (1000000000));
			if (i != n - 1) {
				result.append(" ");
			}
		}

		System.out.println(result);
	}
}
