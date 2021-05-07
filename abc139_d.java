import java.util.*;

/* 問題文
整数 N に対して、{1,2,...,N} を並べ替えた数列 {P1,P2,...,PN} を選びます。
そして、各 i=1,2,...,N について、i を Pi で割った余りを Mi とします。
M1+M2+⋯+MN の最大値を求めてください。
制約
・N は 1≤N≤10＾9 を満たす整数である。
javac -encoding utf-8 Main.java */

class abc139_d{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(n * (n - 1) / 2);
    }
}
