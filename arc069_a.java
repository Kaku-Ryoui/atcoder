import java.util.*;

/* 問題文
すぬけくんはパズルが好きです。
今日は S と c の形をしたピースを使ったパズルで遊んでいます。
このパズルでは図のように c 型のピースを 2つ組み合わせて S 型のピースを 1つ作ることができます。
すぬけくんは S 型のピースを 1つ、c 型のピースを 2 つ組み合わせて Scc という組を可能な限り多く作ることにしました。
すぬけくんが N 個の S 型のピースと M 個の c 型のピースを持っているとき、Scc という組を最大でいくつ作ることが可能か求めなさい。
制約
1≦N,M≦10^12

javac -encoding utf-8 Main.java */

class arc069_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long m = sc.nextLong();
    if (m > n){
      long ans = m - (2 * n);
      ans = (ans / 4) + n;
      System.out.println(ans);
    }else{
      System.out.println(m / 2);
    }
  }
}
