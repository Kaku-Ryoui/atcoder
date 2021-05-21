import java.util.*;

/* 問題文
問題文
長さ n の数列 a1,...,an が与えられます。
空の数列 b に対して、以下の操作を n 回行うことを考えます。
i 回目には数列の i 番目の要素 ai を b の末尾に追加する。b を逆向きに並び替える。
この操作をしてできる数列 b を求めて下さい。
制約
・1≤n≤2×10^5
・0≤ai≤10^9
・n,ai は整数である。

javac -encoding utf-8 Main.java */

class Main{
  public arc077_a void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    long b[] = new long[a];
    for(int i = 0; i < a; i++){
      b[i] = sc.nextInt();
    }

    for(int i = a - 1; i >= 0;i -= 2){
      System.out.print(b[i] + " ");
    }

    for(int i = a % 2;i < a - 1;i += 2){
      System.out.print(b[i] + " ");
    }
  }

}
