import java.util.*;

/* 問題文
魔法使いの高橋君は魔物と戦っています。
高橋君は N 種類の呪文を使うことができます。
i 番目の呪文は詠唱に Xi 秒かかり、威力は Yi です。
ただし、この魔物は強いので、詠唱に S 秒以上かかる呪文や、
威力が D 以下の呪文ではダメージを与えられません。
また、呪文以外の方法でダメージを与えることもできません。
高橋君は魔物にダメージを与えられるでしょうか？
制約
・入力は全て整数
・1≤N≤100
・1≤Xi≤10^9
・1≤Yi≤10^9
・1≤S≤10^9
・1≤D≤10^9
javac -encoding utf-8 Main.java  */

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    int s = sc.nextInt();
    int d = sc.nextInt();
    long ans = 0;
    for(int i = 0; i < n; i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      if(x[i] < s && y[i] > d){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
