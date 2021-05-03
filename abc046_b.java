import java.util.*;

/* 問題文
シカのAtCoDeerくんは一列に並んだ N 個のボールをそれぞれ K 色のペンキの色のうちのどれかで塗ろうとしています。
見栄えが悪くならないように、隣り合ったボールは別の色で塗ることにします。
ボールの塗り方としてあり得るものの個数を求めてください。
制約
・1≦N≦1000
・2≦K≦1000
・答えは 2^31−1 以下

javac -encoding utf-8 Main.java  */

class abc046_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long ans = (long)Math.pow((k-1),(n-1));
    System.out.println(ans*k);
  }
}
