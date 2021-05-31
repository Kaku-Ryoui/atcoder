import java.util.*;

/* 問題文
x 軸上に N 個の観光スポットがあり、1,2,...,N の番号がついています。
観光スポット i は座標 Ai の点にあります。
また、x 軸上を座標 a の点から座標 b の点まで移動するには |a−b| 円かかります。
あなたは x 軸上を旅行する計画を立てました。
計画では、最初に座標 0 の点を出発し、N 個の観光スポットを番号順に訪れ、最後に座標 0 の点に戻ってくることになっています。
ところが、旅行の直前に急用が入り、N 個すべての観光スポットを訪れる時間的余裕がなくなってしまいました。
そこで、ある i を選び、観光スポット i を訪れるのを取りやめることにしました。
 それ以外の観光スポットは予定通り番号順に訪れます。
また、最初に座標 0 の点を出発し、最後に座標 0 の点に戻ってくることについても、予定に変更はありません。
i=1,2,...,N それぞれについて、観光スポット i を訪れるのを取りやめたときの、旅行中の移動にかかる金額の総和を求めてください。
制約
・2≤N≤10＾5
・−5000≤Ai≤5000 (1≤i≤N)
・入力値はすべて整数である。
javac -encoding utf-8 Main.java */

public class arc093_a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+2];
		a[0]=0;
		a[n+1]=0;
		for(int i=1; i<=n; i++) {
			a[i]=sc.nextInt();
		}
		int tot=0;
		for(int i=0; i<=n; i++) {
			tot+=Math.abs(a[i]-a[i+1]);
		}
		for(int i=1; i<=n; i++) {
			int ans=tot-Math.abs(a[i-1]-a[i])-Math.abs(a[i]-a[i+1])+Math.abs(a[i-1]-a[i+1]);
			System.out.println(ans);
		}
	}
}
