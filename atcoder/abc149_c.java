import java.util.*;

/* 問題文
X 以上の素数のうち、最小のものを求めよ。
注記
素数とは、2 以上の整数であって、1 と自分自身を除くどの正の整数でも割り切れないようなもののことです。例えば、2,3,5 は素数ですが、4,6 は素数ではありません。
制約
・2≤X≤10^5
・入力はすべて整数
javac -encoding utf-8 Main.java */

class abc149_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    while(true){  // 無限ループ
      boolean ok = true;// ループ脱出のための判定
      for(int i = 2 ; i < X; i++){
        if(X % i == 0){
          ok =false;
          break;
        }
      }
      // 割り切れればokはfalseになる。
      if(ok){
        break;
      }
      X++;
    }
    System.out.println(X);
  }
}
