import java.util.*;

/* 問題文
0、1、6、8、9 からなる文字列 S が与えられます。
S を 180 度回転したものを出力してください。
すなわち、S に次の操作を施してできる文字列を出力してください。
S を反転する。0 を 0 に、1 を 1 に、6 を 9 に、8 を 8 に、9 を 6 に変換する。
制約
・1≤|S|≤10^5
・S は 0、1、6、8、9 からなる。
javac -encoding utf-8 Main.java  */

class abc202_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder res = new StringBuilder();
    String s = sc.next();
    for(int i = 0 ; i < s.length(); i++){
      if(s.charAt(i) == '6'){
        res.append('9');
      }else if(s.charAt(i) == '9'){
        res.append('6');
      }else{
        res.append(s.charAt(i));
      }
    }
    res.reverse();
    System.out.println(res);
  }
}
