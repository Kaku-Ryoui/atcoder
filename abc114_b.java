import java.util.*;

/* 問題文
数字 1, 2, ..., 9 からなる文字列 S があります。
ダックスフンドのルンルンは、S から連続する 3 個の数字を取り出し、 1 つの整数 X としてご主人様の元に持っていきます。（数字の順番を変えることはできません。）
ご主人様が大好きな数は 753 で、これに近い数ほど好きです。 X と 753 の差（の絶対値）は最小でいくつになるでしょうか？
制約
・S は長さ 4 以上 10 以下の文字列である。
・S の各文字は 1, 2, ..., 9 のいずれかである。
javac -encoding utf-8 Main.java  */

class abc114_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    int N = A.length();
    int ans = 1000;
    int X = 753;
    // 抜き取る文字数-3、添字0を+1で計-2
    for(int i = 0; i < N - 2 ; i++){
      int a = Integer.parseInt(A.substring(i ,i + 3));
      ans = Math.min(ans,Math.abs(a-X));
      }
      System.out.println(ans);
    }
  }
