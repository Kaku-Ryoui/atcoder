import java.util.*;

/* 問題文
N+1 個の街があり、i 番目の街は Ai 体のモンスターに襲われています。
N 人の勇者が居て、i 番目の勇者は i 番目または i+1 番目の街を襲っているモンスターを合計で Bi 体まで倒すことができます。
N 人の勇者がうまく協力することで、合計して最大で何体のモンスターを倒せるでしょうか。
制約入力は全て整数である。
・1≤N≤10^5
・1≤Ai≤10^9
・1≤Bi≤10^9

javac -encoding utf-8 Main.java */

class abc135_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n + 1];
    int b[] = new int[n];

    //a,bはそれぞれ10＾9なのでsumはおさまらない。
    long ans = 0;
    for(int i = 0; i < n + 1; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++){
      b[i] = sc.nextInt();
    }

    for(int i = 0; i < n ; i++){
      // まずは左を全力で倒す
      int left = Math.min(a[i],b[i]);
      ans += left;
      a[i] -= left;
      b[i] -= left;

      // 残った戦力で右を全力で倒す
      int right = Math.min(a[i + 1],b[i]);
      ans += right;
      a[i + 1] -= right;
      b[i] -= right;
    }
    System.out.println(ans);
  }
}
