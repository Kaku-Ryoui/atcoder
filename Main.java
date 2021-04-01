import java.util.*;
import java.math.BigInteger;

/* 問題文
問題文
2 つの正整数 A,B が与えられるので、その大小を比較してください。
制約
・1≦A,B≦10＾100
・入力の A,B の先頭は0でない。
javac -encoding utf-8 Main.java  */

// class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     BigInteger A = sc.nextBigInteger();
//     BigInteger B = sc.nextBigInteger();
//     System.out.println(A.compareTo(B)> 0 ? "GREATER" : A.compareTo(B) == 0 ? "EQUAL" : "LESS");
//   }
// }
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A=sc.nextDouble();
		double B=sc.nextDouble();
    System.out.println(A > B ? "GREATER" : A == B ? "EQUAL" : "LESS");
  }
}
