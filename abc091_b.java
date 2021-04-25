import java.util.*;

/* 問題文
高橋君は青いカードを N 枚，赤いカードを M 枚持っています。
カードにはそれぞれ文字列が書かれており， i 枚目の青いカードに書かれている文字列は si， i 枚目の赤いカードに書かれている文字列は ti です。
高橋君は，文字列を 1 つ言います。 そして，全てのカードを確認し， その文字列が書かれた青いカードを 1 枚見つけるごとに 1 円貰えます。
また，その文字列が書かれた赤いカードを 1 枚見つけるごとに 1 円失います。
なお，高橋君の言った文字列と，カードに書かれた文字列が完全に一致していた場合のみを考えます。 例えば，高橋君が atcoder と言った場合，atcoderr，atcode，btcoder などと書かれた青いカードがあってもお金は貰えません(逆に，このような文字列が書かれた赤いカードがあってもお金を失うことはありません)。
高橋君は，最大で差し引き何円貰うことができるでしょうか？
ただし，違うカードに同じ文字列が書かれていることもあることに注意してください。
制約
・N,M は整数
・1≤N,M≤100
・s1,s2,...,sN,t1,t2,...,tM は全て長さ 1 以上 10 以下の文字列で，英小文字のみからなる
javac -encoding utf-8 Main.java  */

class abc091_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String[n];
    for(int i = 0; i < n; i++){
       s[i] = sc.next();
    }
    int m = sc.nextInt();
    String t[] = new String[m];
    for(int i = 0; i < m; i++){
       t[i] = sc.next();
    }
    int ans = 0;  //めちゃくちゃな入力
    for(int i = 0; i < n; i++){
      int score = 0;
      for(int j = 0; j < n; j++) if(s[i].equals(s[j]))score++;
      for(int j = 0; j < m; j++) if(s[i].equals(t[j]))score--;
      ans = Math.max(ans,score);
    }

    System.out.println(ans);
  }
}
