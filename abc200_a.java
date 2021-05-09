import java.util.*;

/* 問題文
西暦
N
 年は何世紀ですか？

世紀とは？
制約
1
≤
N
≤
3000
avac -encoding utf-8 Main.java */

class abc200_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int cnt = 1;
    int ans = 0;
    while(cnt <= a){
      cnt += 100;
      ans ++;
    }

    System.out.println(ans);
  }
}
