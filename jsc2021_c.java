import java.util.*;

/*
問題文
整数 A,B が与えられます。
整数 x,y を A≤x<y≤B となるように選ぶときの、gcd(x,y) の最大値を求めてください。
なお、gcd(x,y) は x と y の最大公約数を表します。
制約
・A,B は整数
・1≤A<B≤2×10^5
*/

public class jsc2021_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		long max = 0;

		for (int i=1; i <= b; i++) {
			if (b/i - (a-1)/i >= 2) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
