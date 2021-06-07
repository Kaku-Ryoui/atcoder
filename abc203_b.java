import java.util.*;

/* 問題文
問題文AtCoder マンションは 1 階から N 階までの N 階建てのマンションです。
各階には K 室の部屋があり、1 号室から K 号室まで番号が振られています。
ここで N,K は 1 桁の整数であり、 i 階の j 号室の部屋番号は i0j で表されます。
例えば、1 階の 2 号室の部屋番号は 102 です。
マンションの管理人である高橋君は各部屋番号を 3 桁の整数とみなし、
AtCoder マンションに存在するすべての部屋について足しあわせたらいくつになるのか興味を持ちました。
その値を求めてください。
制約
・1≤N,K≤9
・N,K は整数である。

javac -encoding utf-8 Main.java  */

class abc203_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int ans = 0;

    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= k; j++){
        ans += i * 100 + j;
      }
    }

    System.out.println(ans);
  }
}
