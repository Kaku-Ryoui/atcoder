import java.util.*;

/* 問題文
英小文字からなる文字列 S, T が与えられます。
S を回転させて T に一致させられるか判定してください。
すなわち、以下の操作を任意の回数繰り返して S を T に一致させられるか判定してください。
操作: S=S1S2...S|S| のとき、S を S|S|S1S2...S|S|−1 に変更するここで、|X| は文字列 X の長さを表します。
制約
・2≤|S|≤10
・0|S|=|T|
・S, T は英小文字からなる
javac -encoding utf-8 Main.java  */

class abc103_b {
    public static void main(String[] ktr) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println((s + s).contains(t) ? "Yes" : "No");
    }
}
