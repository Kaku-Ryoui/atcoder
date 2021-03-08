import java.util.*;

/* 問題文
お店で N 円の商品を買います。 1000 円札のみを使って支払いを行う時、お釣りはいくらになりますか？
 ただし、必要最小限の枚数の 1000 円札で支払いを行うものとします。
  制約 1 ≤ N ≤ 10000 N は整数
  javac -encoding utf-8 Main.java */

class abc173_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 0;
    for(int i = 1000; ; i +=1000){
      if(N <= i){
        ans = i;
        System.out.println(ans-N);
        return;
      }
    }
  }
}
