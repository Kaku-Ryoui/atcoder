import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*問題文
高橋キングダムには、高橋諸島という、N 個の島からなる諸島があります。
便宜上、これらの島を島 1、島 2、 ...、島 N と呼ぶことにします。
これらの諸島の間では、船の定期便が M 種類運行されています。
定期便はそれぞれ 2 つの島の間を行き来しており、i 種類目の定期便を使うと、
島 ai と島 bi の間を行き来する事ができます。
すぬけくんは今島 1 にいて、島 N に行きたいと思っています。
しかし、島 1 から島 N への定期便は存在しないことがわかりました。
なので、定期便を 2 つ使うことで、島 N に行けるか調べたいと思っています。
これを代わりに調べてあげてください。
制約
・3≦N≦200,000
・1≦M≦200,000
・1≦ai<bi≦N
・(ai,bi)≠(1,N)
・i≠j ならば (ai,bi)≠(aj,bj)
javac -encoding utf-8 Main.java */

class arc079_a{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[] = new int[m];
    int b[] = new int[m];

    for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}
		sc.close();

		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < m; i++) {
			if (a[i] == 0) list.add(b[i]);
			if (b[i] == 0) list.add(a[i]);
			if (a[i] == n - 1) set.add(b[i]);
			if (b[i] == n - 1) set.add(a[i]);
		}

		for (int i : list) {
			if (set.contains(i)) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
