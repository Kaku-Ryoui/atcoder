import java.util.*;

/* 問題文
整数 A,B,C,D が与えられます。
A 以上 B 以下の整数のうち、C でも D でも割り切れないものの個数を求めてください。
制約
・1≤A≤B≤10^18
・1≤C,D≤10^9
・入力はすべて整数である
javac -encoding utf-8 Main.java */

class abc131_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    long cd = lcm(c,d);
    long A = 0;
    long B = 0;
    long abC = 0;
    long abD = 0;
    long abCD = 0;

    // 全探索すると時間が足りない
    // 全体から割り切れる数を数えてその否定

    // ｂまでのｃの倍数の個数
    B = b / c;
    // aより1小さいまでのｃの倍数の個数
    A = (a - 1) / c;
    // 残りの個数
    abC = B - A;

    // ｂまでのdの倍数の個数
    B = b / d;
    // aより1小さいまでのdの倍数の個数
    A = (a - 1) / d;
    // 残りの個数
    abD = B - A;

    // ｂまでのcdの倍数の個数
    B = b / cd;
    // aより1小さいまでのcdの倍数の個数
    A = (a - 1) / cd;
    // 残りの個数
    abCD = B - A;

    // 以上よりｃとｄで割り切れる個数
    long CD = abC + abD - abCD;

    // aからbまでの個数
    long AB = b - a + 1;

    // 答えは
    long ans = AB - CD;

    System.out.println(ans);
  }


// 最大公約数
private static long gcd (long c, long d) {
	long temp;
	while((temp = c % d)!=0) {
		c = d;
		d = temp;
	}
	return d;
}

// 最小公倍数
private static long lcm (long c, long d) {
	long temp;
	long e = c;
	e *= d;
	while((temp = c % d) != 0) {
		c = d;
		d = temp;
	}
	return e/d;
}

}
