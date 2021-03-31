import java.util.*;

/* 問題文
縦 H ピクセル、横 W ピクセルの画像があります。
各ピクセルは英小文字で表されます。
上から i 番目、左から j 番目のピクセルは aij です。
この画像の周囲 1 ピクセルを # で囲んだものを出力してください。
制約
・1≤H,W≤100
・aij は英小文字である。
javac -encoding utf-8 Main.java  */

class abc062_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    for(int i = 0; i < W + 2; i++){
      if(i == W + 1){
        System.out.println("#");
      }else{
        System.out.print("#");
      }
    }
    sc.nextLine();
    for(int i = 0; i < H; i++){
      String a = sc.next();
      System.out.println("#" + a + "#");
    }
    for(int i = 0; i < W + 2; i++){
      if(i == W + 1){
        System.out.println("#");
      }else{
        System.out.print("#");
      }
    }
  }
}

// ■スマートな回答
//
// import java.util.Arrays;
// import java.util.Scanner;
//
// public class Main {
//
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
//
// 		int h = sc.nextInt();
// 		int w = sc.nextInt();
//
// 		char border[] = new char[w + 2];
// 		Arrays.fill(border, '#');
//
// 		System.out.println(border);
// 		for(int i = 0; i < h; i++){
// 			System.out.println('#'+sc.next()+'#');
// 		}
// 		System.out.println(border);
// 	}
// }
