import java.util.*;

/* 問題文
長さ N の数列 A1,A2,...,AN が与えられます。
1 以上 N 以下の各整数 i に対し、次の問いに答えてください。
数列中の Ai を除く N−1 個の要素のうちの最大の値を求めよ。
制約
・2≤N≤200000
・1≤Ai≤20000
・0入力中のすべての値は整数である。
javac -encoding utf-8 Main.java */

class abc134_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int [n];
    int max[] = new int [n];

    for(int i = 0; i < n ; i++){
      a[i] = sc.nextInt();
      max[i] = a[i];
    }

    Arrays.sort(max);

    for(int i = 0; i < n ; i++){
      if(max[n-1] == a[i]){
        System.out.println(max[n-2]);
      }else{
        System.out.println(max[n-1]);
      }
    }

  }
}
