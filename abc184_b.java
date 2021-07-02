import java.util.*;

/* 問題文
高橋くんは、 N 問のクイズに答えます。
高橋くんの持っている点数ははじめ X 点で、クイズに正解すると 1 点増え、
不正解だと 1 点減ります。ただし、持っている点数が 0 点のときに不正解となった場合は点数は減りません。
高橋くんのクイズの結果が文字列 S で与えられます。
S の左から i 番目の文字が o のとき、 i 問目が正解だったことを、
 x のとき、 i 問目が不正解だったことを表します。高橋くんの最終的な点数はいくつでしょうか？

制約
・1≤N≤2×10^5
・0≤X≤2×10^5
・S は o と x からなる長さ N の文字列
javac -encoding utf-8 Main.java  */

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    String s = sc.next();
    int ans = x;
    for(int i = 0; i < n; i++){
      if(s.charAt(i) == 'o'){
        ans++;
      }else{
        if(ans > 0){
          ans--;
        }
      }
    }
    System.out.println(ans > 0 ? ans : 0);
  }
}
