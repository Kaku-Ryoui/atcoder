import java.util.*;

/* 問題文
高橋空港には，毎日飛行機で N 人の乗客が到着します．
 i 番目の乗客は時刻 Ti に到着します．高橋空港に到着する乗客は全員バスで市内へ移動します．
どのバスも定員は C 人であり，C 人以下の乗客を乗せることができます．
飛行機の乗客は，飛行機の到着時刻よりも早く出発するバスには乗ることができません．
また，飛行機の到着時刻から K の時間が経過した後にもバスに乗れていないと，
怒り出してしまいます．
そのため，i 番目の乗客は，出発時刻が Ti 以上 Ti+K 以下であるようなバスに乗れるようにしないといけません．
この条件のもとで，うまくバスの出発時刻を定めるとき，必要なバスの数の最小値を求めてください．
ただし，バスの出発時刻は必ずしも整数である必要はなく，同じ時刻に出発するバスが複数あってもかまいません．
制約
・2≤N≤100000
・1≤C≤109
・1≤K≤109
・1≤Ti≤109
・C,K,Ti は整数
javac -encoding utf-8 Main.java */

class agc011_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int time = 0;
		int num = c;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (num >= c || arr[i] > time + k) {
				cnt++;
				num = 1;
				time = arr[i];
			} else {
				num++;
			}
		}
		System.out.println(cnt);
	}
}
