import java.util.*;

/* 問題文
N 個のレンガが横一列に並んでいます。
左から i (1≤i≤N) 番目のレンガには、整数 ai が書かれています。
あなたはこのうち N−1 個以下の任意のレンガを選んで砕くことができます。
その結果、K 個のレンガが残っているとします。
このとき、任意の整数 i (1≤i≤K) について、残っているレンガの中で左から i 番目のものに書かれた整数が i であるとき、すぬけさんは満足します。
すぬけさんが満足するために砕く必要のあるレンガの最小個数を出力してください。もし、どのように砕いてもそれが不可能な場合、代わりに -1 を出力してください。
制約_
・入力は全て整数である。
・1≤N≤200000
・1≤ai≤N

javac -encoding utf-8 Main.java */

class abc148_d{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int ok = 0;
    int k = 0;
    for(int i = 0; i <n; i++){
      a[i] = sc.nextInt();
      if(a[i] == i + 1 - k){
        ok++;
      }else{
        k++;
      }
    }
    System.out.println(k == n ? -1 : k);
  }
}
