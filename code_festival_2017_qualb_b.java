import java.util.*;

/* 問題文
問題文
りんごさんは CODEFESTIVAL の予選の問題セットを組もうとしています。
りんごさんは N 個の問題案を持っており、i 個目の問題案の難易度は Di です。
予選の問題セットには M 問の問題が必要で、i 問目の問題に使う問題案の難易度はちょうど Ti でなければなりません。
ただし、1 つの問題案を複数の問題に使うことはできません。
りんごさんが新しく問題案を作ることなく予選の問題セットを完成させることができるかを判定して下さい。
制約
1≤N≤200,000
1≤Di≤10^9
1≤M≤200,000
1≤Ti≤10^9
入力される値は全て整数である

部分点
N≤100 かつ M≤100 を満たすデータセットに正解した場合は、100 点が与えられる。

javac -encoding utf-8 Main.java  */

class code_festival_2017_qualb_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d[] = new long[n];
    for(int i = 0; i < n; i++){
      d[i] = sc.nextLong();
    }
    int m = sc.nextInt();
    long t[] = new long[m];
    for(int i = 0; i < m; i++){
      t[i] = sc.nextLong();
    }
    // 小さい順で並べる
    Arrays.sort(d);
    Arrays.sort(t);
    int j = 0;
      for(int i = 0; i < m; i++){
        while(j < n && t[i] > d[j]){//jがnよりも小さく、予選の問題の難易度より持っている問題の難易度が低い
          j++;
        }
        if(j == n || t[i] < d[j]){
          System.out.println("NO");
          return;
        }
        j++;
      }
      System.out.println("YES");
  }
}
