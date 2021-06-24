import java.util.*;

/* 問題文
シカのAtCoDeerくんは、空の貯金箱を持っています。
AtCoDeerくんは、その貯金箱に、1 日目の朝に 1 円、2 日目の朝に 2 円 … というように、
i 日目の朝に i 円を貯金箱に入れます。また、AtCoDeerくんは、
毎日夜に貯金箱にいくら入っているかを確認します。
AtCoDeerくんが貯金箱に N 円以上入っていることを初めて確認するのは、何日目の夜でしょうか?
制約
1≤N≤109N は整数
javac -encoding utf-8 Main.java  */

class abc206_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long i = 0;
    long res = 0;
    while(res < n){
      i++;
      res += i;
    }


    System.out.println(i);
  }
}
