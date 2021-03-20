import java.util.*;

/* 問題文
英小文字からなる文字列 S が与えられます。
S に含まれる文字がすべて異なるか判定してください。
制約
・2≤|S|≤26, ここで |S| は S の長さを表す。
・S は英小文字のみからなる。
javac -encoding utf-8 Main.java  */

class abc063_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    boolean check = true;
    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n; j++){
        if(s.charAt(i) == s.charAt(j)){
          check = false;
          break;
        }
      }
    if(check == false){
      break;
      }
    }
    System.out.println(check?"yes":"no");
  }
}
