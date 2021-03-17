import java.util.*;

/* 高橋君と青木君とすぬけ君はそれぞれクッキーをA,B,C
 個持っています。

この
3
 人はお互いにクッキーを交換することにしました。具体的には、以下の操作を繰り返します。

3
 人は同時に、各々が持っているクッキーを半分ずつに分けて、残りの
2
 人にそれぞれ一方を渡す。
ただし、誰かの持っているクッキーの個数が奇数個になったら、そこで操作を繰り返すのをやめます。

さて、クッキーの交換は何回行うことができるでしょうか。 ただし、無限に続けられる場合もあることに注意してください。javac -encoding utf-8 Main.java */

class agc014_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int ans = 0;
    if(a == b && a == c){
      if(a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
        ans = -1;
      }
    }else{
      // 肝はここの格納して改めて使う繰り返し。
      while(true){
        int newA = a;
        int newB = b;
        int newC = c;
        a = newB/2 + newC/2;
        b = newA/2 + newC/2;
        c = newA/2 + newB/2;
        if(newA % 2 == 1 || newB % 2 == 1 || newC % 2 == 1){
          break;
        }
        ans++;
      }
    }
    System.out.println(ans);
  }
}
