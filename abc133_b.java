import java.util.*;

/* 問題文
D 次元空間上に N 個の点があります。
i 番目の点の座標は (Xi1,Xi2,...,XiD) です。
座標 (y1,y2,...,yD) の点と座標 (z1,z2,...,zD) の点の距離は
√(y1−z1)^2+(y2−z2)^2+...+(yD−zD)^2 です。
i 番目の点と j 番目の点の距離が整数となるような組 (i,j) (i<j) はいくつあるでしょうか。
制約
・入力は全て整数である。
・2≤N≤10
・1≤D≤10−2
・0≤Xij≤20
・同じ座標の点は与えられない。すなわち、i≠j ならば Xik≠Xjk なる k が存在する。

javac -encoding utf-8 abc133_b.java  */

class abc133_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int b[][] = new int[n][d];
    int ans = 0;
    for(int i = 0; i < n; i++){
      for(int j = 0; j < d; j++){
        b[i][j] = sc.nextInt();
      }
    }
    for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {　//i<j
				int sq = 0;
				for(int k = 0; k < d; k++) {
					int s = b[i][k] - b[j][k];
					sq += s*s;
				}
				int s = (int)(Math.sqrt(sq));
// int s = (int)(Math.sqrt(a) + 0.5);//1.9999999になった場合切り捨てで1となるため「+0.5」。
// 回答ではそうだったが納得できなかった。数値が大きくなった場合の処理
				if(s*s == sq) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
