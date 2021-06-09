import java.util.*;

/* 問題文
長さ N の数列 A=(A1,A2,A3,…,AN),B=(B1,B2,B3,…,BN) が与えられます。
以下の条件を満たす整数 x の個数を求めてください。
・1≤i≤N を満たす全ての整数 i について Ai≤x≤Bi
制約
・1≤N≤100
・1≤Ai≤Bi≤1000
・入力に含まれる値は全て整数
javac -encoding utf-8 Main.java  */

class abc199_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int ans = 0;
    for(int i = 0 ; i < n ; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0 ; i < n ; i++){
      b[i] = sc.nextInt();
    }

    Arrays.sort(a);
    Arrays.sort(b);

    System.out.println(a[n - 1] > b[0] ? 0 : b[0] - a[n - 1] + 1);
  }
}
