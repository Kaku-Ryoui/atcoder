import java.util.*;

/* 問題文
xy 平面上に正方形があり、4 つの頂点の座標は反時計回りに順番に (x1,y1),(x2,y2),(x3,y3),(x4,y4) です。
なお、x 軸は右向きに、y 軸は上向きに取ることにします。
高橋君は、これら 4 つの座標のうち (x3,y3),(x4,y4) を忘れてしまいました。
x1,x2,y1,y2 が与えられるので、x3,y3,x4,y4 を復元してください。
なお、これらの条件から、x3,y3,x4,y4 は一意に存在し、整数となることが証明できます。

制約
・|x1|,|y1|,|x2|,|y2|≤100
・(x1,y1) ≠ (x2,y2)
・入力はすべて整数である
javac -encoding utf-8 Main.java  */

class abc108_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    int x3,y3,x4,y4; //0

    int dx = x2-x1;
		int dy = y2-y1;

      x3 = x2 - dy;
      y3 = y2 + dx;
      x4 = x1 - dy;
      y4 = y1 + dx;

    System.out.println(x3+" "+y3+" "+x4+" "+y4);
  }
}
