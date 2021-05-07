import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class arc075_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = 101;
    int sum = 0;
    for(int i = 0; i < n; i++){
      int a = sc.nextInt();
      sum += a;
      if(a % 10 != 0){
        min = Math.min(min , a );
      }
    }
    System.out.println(sum % 10 != 0? sum : min == 101 ? 0 : sum -min);
  }
}
