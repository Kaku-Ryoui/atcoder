import java.util.*;

/* 問題文
高橋君は青と赤の 2 色のボールを持っており、これらを一列に並べようとしています。
初め、列にボールはありません。根気のある高橋君は、次の操作を 10100 回繰り返します。
・列の末尾に、A 個の青いボールを加える。その後、列の末尾に B 個の赤いボールを加える。
こうしてできる列の先頭から N 個のボールのうち、青いボールの個数はいくつでしょうか。
制約
・1≤N≤10^18
・A,B≥0
・0<A+B≤10^18
・入力は全て整数である
javac -encoding utf-8 Main.java  */

class abc158_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();

    // 先にAを掛けるか後にするかで答えが変わる。<A * N/(A + B) >,< N/(A + B) * A>
    System.out.println(N/(A + B) * A + Math.min(N % (A + B) , A));
  }
}
// public class Main {
//
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		long n = scanner.nextLong();
// 		long a = scanner.nextLong();
// 		long b = scanner.nextLong();
// 		System.out.println(n / (a + b) * a + Math.min(n % (a + b), a));
// 	}
//
// }
