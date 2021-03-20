import java.util.*;

/* 問題文
あなたは整数 x を持っています。
最初、x=0 です。あなたは、長さ N の文字列 S をもらったので、これを使って N 回の操作を行いました。
i 回目の操作では、Si=I ならば x の値を 1 増やし、Si=D ならば x の値を 1 減らしました。
操作の途中( 1 回目の操作の前、N 回目の操作の後も含む)で x がとる値の最大値を答えてください。
制約
・1≦N≦100
・|S|=N
・S には、I、D 以外の文字は含まれない
javac -encoding utf-8 Main.java  */

class abc052_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int x = 0;
    int ans = 0;
    for(int i = 0; i < N; i++){
      if(S.charAt(i) == 'I'){
        x++;
        ans = Math.max(x,ans);
      }else{
        x--;
        ans = Math.max(x,ans);
      }
    }

    System.out.println(ans);
  }
}
