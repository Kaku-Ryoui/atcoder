import java.util.*;

/* 問題文
N 本の木があり、 i 番目の木には Ai 個の木の実が実っています。
シマリスは、次のルールで全ての木から木の実を収穫します。
・実っている木の実が 10 個以下の木からは木の実を収穫しない
・実っている木の実が 10 個より多い木からは、10 個を残して残りの全てを収穫する

シマリスが収穫する木の実の個数の合計を求めてください。
制約
・1≤N≤1000
・0≤Ai≤1000
・入力に含まれる値は全て整数である
javac -encoding utf-8 Main.java  */

class abc204_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int ans = 0;
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      if(a[i] > 10){
        ans += a[i] - 10;
      }
    }

    System.out.println(ans);
  }
}
