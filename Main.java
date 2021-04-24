import java.util.*;

/* 問題文
今日は, 記念すべき AtCoder Beginner Contest 100 が開催される.
そのため, 高橋君はりんごさんに, ある整数をプレゼントしようと思った.
今日のコンテストは「AtCoder Beginner Contest 100」なので, りんごさんは 100 で ちょうど D 回割りきれる正の整数をプレゼントされると喜ぶ.
さて, りんごさんがプレゼントされると喜ぶような整数のうち N 番目に小さいものを求めなさい.
制約
・D は 0,1,2 のいずれかである
・N は 1 以上 100 以下の整数
javac -encoding utf-8 Main.java  */

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double d = sc.nextDouble();
    int n = sc.nextInt();

    System.out.println((long)Math.pow(100.0,d) * (n + n / 100));
  }
}
