import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class jsc2021_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double z = sc.nextDouble();
    double ans = 0;
    ans = z * (y/x) ;
    System.out.println((int)ans/z < y/x ? (int)ans:(int)ans - 1);
  }
}
