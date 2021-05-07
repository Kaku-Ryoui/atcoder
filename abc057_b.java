import java.util.*;

/* 問題文javac -encoding utf-8 Main.java  */

class abc057_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    int c[] = new int[m];
    int d[] = new int[m];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    for(int i = 0; i < m; i++){
      c[i] = sc.nextInt();
      d[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++){
      int min = Integer.MAX_VALUE;
      int index = 0;
      for(int j = 0; j < m; j++){
        int tem = Math.abs(a[i] - c[j]) + Math.abs(b[i] - d[j]);
        if(tem < min){
          min = tem;
          index = j;
        }
      }
      System.out.println(index + 1);
    }
  }
}
