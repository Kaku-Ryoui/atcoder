import java.util.*;

/* 問題文
数列 a={a1,a2,a3,......} は、以下のようにして定まります。

・初項 s は入力で与えられる。
・関数 f(n) を以下のように定める: n が偶数なら f(n)=n/2、n が奇数なら f(n)=3n+1。
・i=1 のとき ai=s、i>1 のとき ai=f(ai−1) である。
このとき、次の条件を満たす最小の整数 m を求めてください。
・am=an(m>n) を満たす整数 n が存在する。

制約
・1≦s≦100
・入力はすべて整数である。
・a のすべての要素、および条件を満たす最小の m は 1000000 以下となることが保証される。
javac -encoding utf-8 Main.java  */

class abc116_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    int ans = 0;
    Set<Integer> set = new HashSet<>();
    while(!set.contains(S)){ //setに値が含まれなければ
      set.add(S);
      if(S%2 == 0){
        S /= 2;
      }else{
        S = 3 * S + 1;
      }
      ans++;
    }

    System.out.println(ans + 1);
  }
}
