import java.util.*;

/* 問題文
N 個の都市があり、M 本の道路があります。
i(1≦i≦M) 番目の道路は、都市 ai と 都市 bi (1≦ai,bi≦N) を双方向に結んでいます。
同じ 2 つの都市を結ぶ道路は、1 本とは限りません。
各都市から他の都市に向けて、何本の道路が伸びているか求めてください。
制約
・2≦N,M≦50
・1≦ai,bi≦N
・ai≠bi
・入力は全て整数である。
javac -encoding utf-8 Main.java  */

class abc061_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[] = new int[m];
    int b[] = new int[m];
    int ans[] = new int[n];
    for(int i = 0; i < m; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      ans[a[i] - 1]++;
      ans[b[i] - 1]++;
    }
    for (int i = 0; i < n; i++){
      System.out.println(ans[i]);
    }
  }
}
