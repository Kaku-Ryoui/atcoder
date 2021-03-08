import java.util.*;

/* 問題文
高橋君は青木君と待ち合わせをしています。
 待ち合わせ場所は高橋君の家から D メートル離れた地点であり、
 待ち合わせの時刻は T 分後です。
  高橋君は今から家を出発し、分速 S メートルで待ち合わせ場所まで
  まっすぐ移動します。 待ち合わせに間に合うでしょうか？
  制約 1 ≤ D ≤ 10000 1 ≤ T ≤ 10000 1 ≤ S ≤ 10000 入力は全て整数
   */

class abc177_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int T = sc.nextInt();
    int S = sc.nextInt();

    System.out.println(D <= S*T?"Yes":"No");
  }
}
