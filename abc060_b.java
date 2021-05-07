import java.util.*;

/* 問題文javac -encoding utf-8 Main.java  */

class abc060_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    for(int i = a; i < a * b; i = i + a){
      if(i % b == c){
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}
