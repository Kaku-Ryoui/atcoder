import java.util.*;

/* 問題文
DISCO 社の高橋君の前に，1 本の鉄の棒が置かれています．
この棒は，N−1 個の切れ目によって N 個の区間に分かれています．
左から i 個目の区間の長さは Ai ミリメートルです．
高橋君は，切れ目を一つ選んでそこで棒を切り，同じ長さの棒を 2 本作ることを考えました．
しかし，今の状態では，どの切れ目を選んでも 2 本の棒を同じ長さにすることができないかもしれません．
そこで，彼は棒を切る前に，以下の操作を何回か行うことにしました．
・棒の区間のうち 1 つを選び，膨張させ，長さを 1 ミリメートル増やす．この操作を 1 回行うのに 1 円かかる．
・棒の区間のうち長さが 2 ミリメートル以上のもの 1 つを選び，収縮させ，長さを 1 ミリメートル減らす．この操作を 1 回行うのに 1 円かかる．
彼が棒を 2 等分するために必要な最小の金額は何円か，求めてください．
制約
・2≤N≤200000
・1≤Ai≤2020202020
・N,Ai は整数
javac -encoding utf-8 Main.java  */

class ddcc2020_qual_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a[] = new long[n];
    long d = 0;

    for(int i = 0; i < n; i++){
      a[i] = sc.nextLong();
      d += a[i];
    }

    long ans = Long.MAX_VALUE;
    long Lsum = 0;
    long Rsum = d;
    for(int i = 0; i < n; i++){
      Lsum += a[i];
      Rsum -= a[i];
      ans = Math.min(ans,Math.abs(Lsum - Rsum));
      if(ans != Math.abs(Lsum - Rsum)){
        System.out.println(ans);
        return;
      }
    }
  }
}
