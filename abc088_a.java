import java.util.*;

/* 問題文
E869120 は 1 円硬貨を A 枚と 500 円硬貨を無限枚持っています.
これらの硬貨だけを使うことによって, ちょうど N 円を支払うことができるかを
判定しなさい.
制約
N は 1 以上 10000 以下の整数
A は 0 以上 1000 以下の整数
 */

class abc088_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    //xは５００円の余り
    int x = N % 500;
    int ans = A - x;
    System.out.println( ans >= 0  ? "Yes" : "No");
  }
}
