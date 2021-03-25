import java.util.*;

/* 問題文
整数 a，b (a≤b) が与えられます。 a，a+1，...，b すべての積が、正か、負か、0 かを判定してください。
制約
・a，b は整数である。
・−10^9≤a≤b≤10^9
部分点
・100 点分のデータセットでは、−10≤a≤b≤10 が成り立つ。
javac -encoding utf-8 Main.java */

class agc002_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a<=0 && 0<=b){
      System.out.println("Zero");
    }else if(a<=0 && (b-a+1)%2==1){
      System.out.println("Negative");
    }else{
      System.out.println("Positive");
    }
  }
}
