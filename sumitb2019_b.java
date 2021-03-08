import java.util.*;

/* 問題文
高橋君は ABC 洋菓子店でアップルパイをひとつ買い、
そのとき N 円を支払ったことを覚えています。
この店で食料品を購入する際には 8 パーセントの消費税が課されます。
すなわち、税抜価格 X 円のアップルパイを買う際には X × 1.08 円 (小数点以下切り捨て) を支払わなければなりません。
高橋君はアップルパイの税抜価格 X を忘れてしまい、これを知りたくなりました。
N を入力として X を求めるプログラムを書いてください。なお、 X は整数とします。
ただし、考えられる税抜価格が複数存在する場合はそのうちのいずれか1 つを求めてください。
また、高橋君が支払った金額 N を覚え間違えている可能性もあるので、
アップルパイの税抜価格として考えられるものが存在しない場合はその旨を報告してください。 制約
1 ≤ N ≤ 50000
N は整数javac -encoding utf-8 Main.java  */

class sumitb2019_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = 0;
    for(X = 1; X <= N; X++){
      if(Math.floor(X*1.08) == N){
        System.out.println(X);
        return;
      }
    }
    System.out.println(":(");
  }
}
