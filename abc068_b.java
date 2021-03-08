import java.util.*;

/* 高橋君は 2 で割れる数が好きです。 正整数 N が与えられるので、 1 以上 N 以下の整数のうち、
最も 2 で割れる回数が多いものを求めてください。答えは必ず 1 つに定まります。
なお、 2 で割っていき、何回あまりが出ずに割れるかを、 2 で割れる回数と呼ぶことにします。
例えば
6 ならば、 6 -> 3 で、 1 回 2 で割れます。
8 ならば、 8 -> 4 -> 2 -> 1 で、 3 回 2 で割れます。
3 ならば、 0 回 2 で割れます。
制約 1 ≦ N ≦ 100  */

class abc068_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    int res = 1;
    for(; res <= N; res *= 2){
      }
      System.out.println(res/2);
    }
  }
