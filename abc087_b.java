import java.util.*;

/* 問題文
あなたは、500 円玉を A 枚、100 円玉を B 枚、50 円玉を C 枚持っています。
これらの硬貨の中から何枚かを選び、合計金額をちょうど X 円にする方法は何通りありますか。
同じ種類の硬貨どうしは区別できません。
2 通りの硬貨の選び方は、ある種類の硬貨についてその硬貨を選ぶ枚数が異なるとき区別されます。
制約
・0≤A,B,C≤50
・A+B+C≥15
・0≤X≤20,000
・A,B,C は整数である
・X は 50 の倍数である
javac -encoding utf-8 Main.java  */

class abc087_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();//500
    int b = sc.nextInt();//100
    int c = sc.nextInt();//50
    int x = sc.nextInt();
    int ans = 0;
    for(int i = 0; i <= a; i++){
      for(int j = 0; j <= b; j++){
        for(int k = 0; k <= c; k++){
          if(x == 500 * i + 100 * j + 50 * k ){
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}
