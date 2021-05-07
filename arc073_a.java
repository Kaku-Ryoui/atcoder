import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class arc073_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int T = sc.nextInt();

    long r = 0;
    int t2 = 0;
    for(int i = 0; i < n; i++){
      int t = sc.nextInt();
      t2 = t - t2;
      r += Math.min(t2, T);
      t2 = t;
    }
    r += T;
    System.out.println(r);
  }
}
