import java.util.*;

/* 問題文
N 個の正整数 a1,a2,...,aN が与えられます。
非負整数 m に対して、f(m)=(m mod a1)+(m mod a2)+...+(m mod aN) とします。
ここで、X mod Y は X を Y で割った余りを表します。
f の最大値を求めてください。
制約
・入力は全て整数である
・2≤N≤30002≤ai≤105
javac -encoding utf-8 Main.java */

class abc103_cs{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =- n;

    for(int i = 0; i < n; i++){
      int a = sc.nextInt();
      sum += a;
    }

    System.out.println(sum);
  }
}
