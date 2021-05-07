import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class abc154_d{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),k = sc.nextInt(),p[]=new int[n],sum[]=new int[n+1];
    for(int i = 0; i < n; i++){
      p[i] = sc.nextInt() + 1;
      if (i == 0)sum[i] = 0;
      sum[i + 1] = sum[i]+p[i];
    }
    double ans = 0;
    for (int i = 0;i <= n-k; i++) {
      ans = Math.max(ans,sum[i + k] - sum[i]);
    }
    System.out.println((double)ans/2);
  }
}
