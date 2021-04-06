import java.util.*;

/* 問題文
joisinoお姉ちゃんは、あるプログラミングコンテストの決勝を控えています。
このコンテストでは、N 問の問題が用意されており、それらには 1～N の番号がついています。
joisinoお姉ちゃんは、問題 i(1≦i≦N) を解くのにかかる時間が Ti 秒であることを知っています。
また、このコンテストでは、M 種類のドリンクが提供されており、1～M の番号がついています。
そして、ドリンク i(1≦i≦M) を飲むと、脳が刺激され、問題 Pi を解くのにかかる時間が Xi 秒になります。
他の問題を解くのにかかる時間に変化はありません。
コンテスタントは、コンテスト開始前にいずれかのドリンクを 1 本だけ飲むことができます。
joisinoお姉ちゃんは、それぞれのドリンクについて、それを飲んだ際に、全ての問題を解くのに何秒必要なのかを知りたくなりました。
全ての問題を解くのに必要な時間とは、それぞれの問題を解くのにかかる時間の合計です。
あなたの仕事は、joisinoお姉ちゃんの代わりにこれを求めるプログラムを作成することです。
制約
・入力は全て整数である
・1≦N≦100
・1≦Ti≦10^5
・1≦M≦100
・1≦Pi≦N1≦Xi≦10^5
javac -encoding utf-8 Main.java  */

class abc050_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t[] = new int[n];
    int u[] = new int[n];
    for(int i = 0; i < n; i++){
      t[i] = sc.nextInt();
      u[i] = t[i];
    }
    int m = sc.nextInt();
    int p[] = new int[m];
    int x[] = new int[m];
    int sum[] = new int[m];
    for(int j = 0; j < m; j++){
      p[j] = sc.nextInt();
      x[j] = sc.nextInt();
      t[p[j] - 1] = x[j];
      for(int i = 0; i < n; i++){
        sum[j] += t[i];
      }
      System.out.println(sum[j]);
      t[p[j] - 1] = u[p[j] - 1];
    }
  }
}
