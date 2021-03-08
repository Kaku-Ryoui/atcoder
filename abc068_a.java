import java.util.*;

/* 問題文
このコンテスト、つまり AtCoder Beginner Contest の略称は、アルファベット 3 文字で ABC となっております。
そして、ABC のうち特定の回を指すときは、何回目の ABC かを 3 桁の数字で表して後ろに付け、
ABC680 のように呼びます。例えば ABC680 は、 680 回目の ABC のことを指します。
では、 N 回目の ABC はどのように表すでしょうか、これを出力するプログラムを作成してください。
制約 100 ≦ N ≦ 999javac -encoding utf-8 Main.java */

class abc068_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println("ABC" + N);
  }
}
