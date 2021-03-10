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
    int N = sc.nextInt();
    int K = sc.nextInt();
    // 最小値まで引くのは余りと等しい。余り「N % K」
    // 「K-余り」が「余り」より小さい時、「K-余り」が最小値
    int x = Math.min(N % K, K - N % K);

    System.out.println(x);
  }
}
