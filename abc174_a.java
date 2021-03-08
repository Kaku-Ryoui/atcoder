import java.util.*;

/* 問題文
問題文
あなたは、室温が 30 度以上のとき、またそのときに限り、冷房の電源を入れます。
今の室温は X 度です。冷房の電源を入れますか？
制約 − 40 ≤ X ≤ 40 X は整数である。
 javac -encoding utf-8 Main.java */

class abc174_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X =sc.nextInt();
    System.out.println(X >= 30 ? "Yes" : "No");
  }
}
