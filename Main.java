import java.util.*;

/* 問題文
すぬけ君は新しくできたプログラミングコンテストに会員登録しました。
登録に使ったパスワードを覚えておく自信が無かったすぬけ君は、 手元の紙にパスワードをメモしておくことにしました。
ただし、そのままメモをすると誰かにパスワードを盗まれてしまうかもしれないので、
文字列の偶数番目の文字と奇数番目の文字をそれぞれ別々の紙にメモしておくことにしました。
パスワードの奇数番目の文字だけを順番を変えずに取り出した文字列 O と、
偶数番目の文字だけを順番を変えずに取り出した文字列 E が与えられます。
すぬけ君のかわりにパスワードを復元してください。
制約
・O, E は小文字のアルファベット( a - z )からなる文字列
・1≤|O|,|E|≤50
・|O|−|E| は 0 または 1 である。

javac -encoding utf-8 Main.java  */

class abc058_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String o = sc.next();
    String e = sc.next();
    // String strArray[] =new String[o.length() + e.length()];
    String ans = "";
    for(int i = 0; i < o.length() + e.length() ;i++){
      if(i == 0){
        ans = String.valueOf(o.charAt(0));
      }else if(i == 1){
        ans += String.valueOf(e.charAt(0));
      }else if(i % 2 == 0){
        ans += String.valueOf(o.charAt(i / 2));
      }else{
        ans += String.valueOf(e.charAt((i - 1)/ 2));
      }
    }
    System.out.println(ans);
  }
}
