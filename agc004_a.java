import java.util.*;

/* 問題文
問題文1×1×1 のブロックが A×B×C の直方体状に並んでいます。
高橋君は各ブロックを赤色または青色で塗ろうとしています。
このとき、次の条件が成り立つようにします。
赤いブロックも青いブロックもそれぞれ 1 個以上ある。
赤いブロック全体が 1 つの直方体状になっている。
青いブロック全体が 1 つの直方体状になっている。
高橋君は、赤いブロックの個数と青いブロックの個数の差をできるだけ小さくしたいと思っています。
赤いブロックの個数と青いブロックの個数の差の最小値を求めてください。
制約
・2≤A，B，C≤10^9
javac -encoding utf-8 Main.java */

class agc004_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a[] = {sc.nextLong(),sc.nextLong(),sc.nextLong()};
    Arrays.sort(a);
    // 最大の長さを割る2。切り捨てが最小
    long min = a[2] / 2;
    if(a[2] % 2 == 0){
      System.out.println(0);
      return;
    }else{
      System.out.println((a[0] * a[1] * (min + 1)) - (a[0] * a[1] * min));
      return;
    }
  }
}
