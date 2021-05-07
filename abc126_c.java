import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class abc126_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String tmp[] = sc.nextLine().split(" ");
    int N = Integer.parseInt(tmp[0]);
    int K = Integer.parseInt(tmp[1]);

    double ans = 0;

    for(long i = 1; i <= N; i++){
      // iはさいころの目
      if(i >= K){
        ans += 1.0 / N;
      }else {
        int rp = 1;
        long point = i * 2;
        while( K > point){
          rp++;
          point *= 2;
        }
        ans += 1.0 /(Math.pow(2,rp) *N);
      }
    }
    System.out.println(ans);
  }
}
