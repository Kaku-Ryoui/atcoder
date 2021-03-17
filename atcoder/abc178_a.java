import java.util.*;

/* 問題文
0 以上 1 以下の整数 x が与えられます。
 x が 0 なら 1 を、 1 なら 0 を出力してください。
 */

class abc178_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println( x == 0 ? 1:0);
  }
}
