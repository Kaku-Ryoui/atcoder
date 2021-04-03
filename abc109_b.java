import java.util.*;

/* 問題文
高橋くんは今日も 1 人でしりとりの練習をしています。
しりとりとは以下のルールで遊ばれるゲームです。
・はじめ、好きな単語を発言する以降、次の条件を満たす単語を発言することを繰り返す
・その単語はまだ発言していない単語であるその単語の先頭の文字は直前に発言した単語の末尾の文字と一致する
高橋くんは、10 秒間にできるだけ多くの単語を発言する練習をしています。
高橋くんが発言した単語の個数 N と i 番目に発言した単語 Wi が与えられるので、
どの発言もしりとりのルールを守っていたかを判定してください。
制約
・N は 2≤N≤100 を満たす整数である
・Wi は英小文字からなる長さ 1 以上 10 以下の文字列である
javac -encoding utf-8 Main.java  */

class abc109_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String w[] = new String[n];
    boolean ans = true;
    for(int i = 0; i < n; i++){
      w[i] = sc.next();
      for(int j = 0; j < i; j++){
        if(w[i].equals(w[j])){
          ans = false;
        }
      }
    }

    for(int i = 0; i< n-1; i++){
      if(w[i].charAt(w[i].length() - 1) != w[i + 1].charAt(0)){
        ans = false;
      }
    }
    System.out.println(ans ? "Yes" : "No");
  }
}
