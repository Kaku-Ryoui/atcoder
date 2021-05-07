import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class agc015_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a = sc.nextInt();
    long b = sc.nextInt();

    long tt = (n -2) * (b - a) + 1;
    if(tt < 0){
      System.out.println(0);
    }else{
      System.out.println(tt);
    }
  }
}
