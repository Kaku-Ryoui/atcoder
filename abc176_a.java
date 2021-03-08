import java.util.*;

/* 問題文
高橋君はたこ焼きが好きです。 たこ焼き器を使うと、
 1 度に最大で X 個のたこ焼きを作ることができます。
 これにかかる時間は作る個数によらず T 分です。
  N 個のたこ焼きを作るためには何分必要ですか？
  制約 1 ≤ N , X , T ≤ 1000
   入力は全て整数 */

class Main{
  public static void abc176_a(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int T = sc.nextInt();
//N=（１度に作る）X個 * （１度の時間）T分＊（N個作るまでの回数）ｔ
//ｔを左に移項
    double t = Math.ceil((double)N/X)*T;
		System.out.println((int)t);
  }
}
