import java.util.*;

/* 問題文
青木君は任意の整数 x に対し、以下の操作を行うことができます。
操作: xをxとKの差の絶対値で置き換える。
整数
N の初期値が与えられます。この整数に上記の操作を0 回以上好きな回数行った時にとりうる Nの最小値を求めてください。

javac -encoding utf-8 Main.java */


class abc161_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 10^18なのでlong
    long N = sc.nextLong();
    long K = sc.nextLong();

    // 絶対値なので場合分け
    // 正：x >= K は、x-K 負に行く直前は余りと等しい。余り「N % K」
    // 負：x < K は、K-x  K-余り「N % K」
    long x = Math.min(N % K, K - N % K);

    System.out.println(x);
  }
}
