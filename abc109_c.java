import java.util.*;

/* 問題文
数直線上に N 個の都市があり、i 番目の都市は座標 xi にあります。
あなたの目的は、これら全ての都市を 1 度以上訪れることです。
あなたは、はじめに正整数 D を設定します。その後、あなたは座標 X から出発し、以下の移動 1、移動 2 を好きなだけ行います。
移動 1: 座標 y から座標 y+D に移動する移動 2: 座標 y から座標 y−D に移動する全ての都市を 1 度以上訪れることのできる D の最大値を求めてください。
ここで、都市を訪れるとは、その都市のある座標に移動することです。
制約
入力はすべて整数である
・1≤N≤10^5
・1≤X≤10^9
・1≤xi≤10^9
・xi はすべて異なる
・x1,x2,...,xN≠X
javac -encoding utf-8 Main.java */

class abc109_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X = sc.nextLong();
    long ans = Math.abs(X - sc.nextLong());
    for(int i = 1; i < N; i++){
      ans = gcd(ans , Math.abs(X - sc.nextLong()));
    }
    System.out.println(ans);
  }

  public static long gcd(long a, long b){
    return b == 0 ? a : gcd(b, a % b);
  }
}
