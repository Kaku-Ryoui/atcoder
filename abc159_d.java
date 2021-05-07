import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class abc159_d{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    long B[] = new long[N + 1];
    int C[] = new int[N];
    long ans = 0;
      for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
        B[A[i]]++;
      }

      for(int i = 1; i < N + 1; i++){
        ans += B[i]*(B[i] - 1 ) /2;
      }

      for(int i = 0; i < N; i++){
        System.out.println(ans - B[A[i]] + 1);
      }
  }
}
