import java.util.*;

/* 問題文
1 以上 N 以下の整数からなる長さ N の数列 A=(A1,A2,…,AN) が与えられます。
A が (1,2,…,N) の並び替えによって得られるかどうか判定してください。
制約
1≤N≤10^3
1≤Ai≤N
入力は全て整数である。
javac -encoding utf-8 Main.java  */

class abc205_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);

    for(int i = 0; i < n; i++){
      if(a[i] != i + 1){
          System.out.println("No");
          return;
      }
    }
    System.out.println("Yes");
  }
}
