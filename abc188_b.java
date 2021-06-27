import java.util.*;

/* 問題文
2 つの N 次元ベクトル A=(A1,A2,A3,…,AN),B=(B1,B2,B3,…,BN) が与えられます。
A と B の内積が 0 かどうかを判定してください。
すなわち、A1B1+A2B2+A3B3+⋯+ANBN=0 かどうかを判定してください。
制約
1≤N≤100000
−100≤Ai≤100
−100≤Bi≤100
入力に含まれる値は全て整数である

javac -encoding utf-8 Main.java  */

public class abc188_b {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		sc.nextLine();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			ans += A[i] * sc.nextInt();
		}
		if (ans == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
