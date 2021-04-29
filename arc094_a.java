import java.util.*;

/* 問題文
問題文3 つの整数 A,B,C が与えられます。
以下の 2 種類の操作を好きな順で繰り返して A,B,C をすべて等しくするために必要な操作の最小回数を求めてください。
A,B,C のうち 2 つを選んで、その両方を 1 増やすA,B,C のうち 1 つを選んで、
その整数を 2 増やすなお、これらの操作を繰り返して A,B,C をすべて等しくできることは証明できます。
制約
・0≤A,B,C≤50
・入力はすべて整数である
javac -encoding utf-8 Main.java */

class arc094_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 大小を調べる際、Arrays.sortで調べる
    int a[] = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
    Arrays.sort(a);
    // 減少できないので、最大を起点に考える
    // 最大からの差を求め、足す
    int b = a[2] - a[0] + a[2] - a[1];

    if(b % 2 == 0){
      System.out.println(b/2);
    }else{
      System.out.println(b/2 + 2);
    }
  }
}
