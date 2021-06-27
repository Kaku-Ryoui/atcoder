import java.util.*;

/* 問題文
水色のボールが A 個容器に入っています。高橋くんはこの容器に対し、以下の操作を 0 回以上好きなだけ繰り返します。
・水色のボール B 個と赤色のボール C 個を容器に追加する。
高橋くんの目標は、容器に入っている水色のボールの個数が赤色のボールの個数の D 倍以下になるようにすることです。
目標が達成可能かを判定し、可能なら必要な操作回数の最小値を求めてください。
制約
・1≤A,B,C,D≤10^5
・入力は全て整数である。
javac -encoding utf-8 Main.java  */

public class abc207_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int cnt = -1;
        if (b < c * d) {
            double jud = (double)a / (c*d-b);
            cnt = (int)Math.ceil(jud);
        }
        System.out.print(cnt);
    }
}
