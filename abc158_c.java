import java.util.*;

/* 問題文
消費税率が 8 %のとき A 円、10 ％のとき B 円の消費税が課されるような商品の税抜き価格を求めてください。
ただし、税抜き価格は正の整数でなければならないものとし、
消費税の計算において小数点以下は切り捨てて計算するものとします。
条件を満たす税抜き価格が複数存在する場合は最も小さい金額を出力してください。
また、条件を満たす税抜き価格が存在しない場合は -1 と出力してください。
制約
・1≤A≤B≤100
・A,B は整数である
javac -encoding utf-8 Main.java */

class abc158_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for(int n = 0; n < 10000; n++){
      int za = n * 8 / 100;
      int zb = n * 10 / 100;
      if(a == za && b == zb){
        System.out.println(n);
        return;
      }
    }
    System.out.println(-1);
  }
}
