import java.util.*;

/* 問題文
縦 H ピクセル、横 W ピクセルの画像があります。
全てのピクセルは . または * で表されるものとします。
上から i 番目、左から j 番目のピクセルを表す文字を Ci,j で表します。
この画像を 2 倍縦長にした画像を出力してください。
すなわち、縦 2H ピクセル、横 W ピクセルの画像であって、上から i 番目、左から j 番目のピクセルは、C(i+1)/2,j (ただし、割り算は切り捨て)と等しい画像を出力してください。
制約
・1≦H,W≦100
・Ci,j . または * である。
javac -encoding utf-8 Main.java  */

class abc049_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    for(int i = 0; i < h; i++){
      String c = sc.next();
        System.out.println(c);
        System.out.println(c);
			  // System.out.println(c+"\n"+c);
      }
    }
  }
