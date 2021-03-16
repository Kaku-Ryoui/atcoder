import java.util.*;

/* 問題文
大きさ N の順列 ((1, 2, ..., N) を並び替えてできる数列) P, Q があります。
大きさ N の順列は N! 通り考えられます。
このうち、P が辞書順で a 番目に小さく、Q が辞書順で b 番目に小さいとして、|a−b| を求めてください。
注記
2 つの数列 X, Y について、ある整数 k が存在して Xi=Yi (1≤i<k) かつ Xk<Yk が成り立つとき、X は Y より辞書順で小さいと定義されます。制約2≤N≤8P, Q は大きさ N の順列である。入力は全て整数である。


javac -encoding utf-8 Main.java */

class abc150_c{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int P[] = new int[N];
  int Q[] = new int[N];

  for (int i = 0; i < N; i++) {
    P[i] = sc.nextInt();
  }
  for (int i = 0; i < N; i++) {
    Q[i] = sc.nextInt();
  }

  int result = num(P,N) - num(Q ,N);
  System.out.println(Math.abs(result));
  }

// 順列の処理
  private static int num(int[] P, int N) {
		int a = 0;
		for (int i = 0; i < N - 1; i++) {
      int inversion = 0;
			for (int j = i + 1; j < N; j++) {
				if (P[i] > P[j]) {
					inversion++;
				}
			}
			a += inversion;
			a *= (N - i - 1);
		}
		return a;
	}

}
