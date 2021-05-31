import java.util.*;

/* 問題文
AtCoder王国の王立問題工房でABC管理官の座に就いたキザハシ君は、
浮かれるあまり仕事を引き受けすぎてしまいました。
現在の時刻は 0 です。キザハシ君は 1 から N までの番号が振られた N 件の仕事を持っています。
キザハシ君が仕事 i を終えるには Ai 単位時間かかります。
また、仕事 i の〆切は時刻 Bi であり、これまでに仕事を終わらせる必要があります。
時刻 Bi ちょうどに仕事 i を終わらせてもかまいません。
キザハシ君は 2 件以上の仕事を同時にすることはできませんが、
ある仕事を終わらせた直後に別の仕事を始めることはできます。
キザハシ君はすべての仕事を〆切までに終わらせることができるでしょうか。
可能ならば Yes、不可能ならば No を出力してください。
制約
・入力はすべて整数
・1≤N≤2×10^5
・1≤Ai,Bi≤10^9(1≤i≤N)

javac -encoding utf-8 Main.java */

class abc131_d{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		Obj[] arr = new Obj[n];
		for (int i = 0; i < n; i++) {
			Obj o = new Obj();
			o.a = sc.nextInt();
			o.b = sc.nextInt();
			arr[i] = o;
		}
		sc.close();

		Arrays.sort(arr, (o1, o2) -> o1.b - o2.b);
		long now = 0;
		for (Obj o : arr) {
			now += o.a;
			if (now > o.b) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	static class Obj {
		int a, b;
	}
}
