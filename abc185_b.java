import java.util.*;

/* 問題文
高橋君のスマートフォンのバッテリー容量は N [mAh] であり、時刻 0.5,1.5,2.5,… に、
つまり時刻 n+0.5(n は整数) を迎える度にバッテリー残量が 1 [mAh] ずつ減少します。
高橋君はスマートフォンを満充電した状態で時刻 0 に外出し、途中で M 回カフェを訪れ、
時刻 T に帰宅します。i 回目に訪れるカフェには時刻 Ai から時刻 Bi まで滞在します。
カフェに滞在している間はスマートフォンを充電するため、バッテリー残量は減少せず、
代わりに時刻 n+0.5(n は整数) を迎える度に 1 [mAh] ずつ増加します。
ただし既にバッテリー残量がバッテリー容量と等しい場合、バッテリー残量は増えも減りもしません。
高橋君が途中でスマートフォンのバッテリー残量が 0 になることなく
帰宅することができるかを判定してください。
制約
・1≤N≤10^9
・1≤M≤1000
・1≤T≤10^9
・0<A1<B1<A2<B2<A3<B3<⋯<AM<BM<T
・入力は全て整数
javac -encoding utf-8 Main.java  */

public class abc185_b {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int MaxN = sc.nextInt();
		int N = MaxN;
		int M = sc.nextInt();
		int T = sc.nextInt();
		int tmpS = 0;
		int tmpE = 0;

		int now = 0;
		for(int i = 0;i < M;i++) {
			tmpS = sc.nextInt();
			tmpE = sc.nextInt();

			// カフェに入るまでのバッテリー消費処理
			N = N - (tmpS - now);
			if(N <= 0) {
				System.out.println("No");
				return;
			}

			// カフェに入ってからの充電処理
			N = N + (tmpE - tmpS);
			if(N > MaxN) {
				N = MaxN;
			}

			now = tmpE;

		}
		sc.close();

		// 最後のカフェから家に帰るまでの充電処理
		N = N - (T - tmpE);
		if(N <= 0) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
  }
}
