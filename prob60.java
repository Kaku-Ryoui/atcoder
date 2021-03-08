import java.util.*;

/* 改行区切りで整数がn個入力されるので、n個の整数のうち、5以上のものを全て足し合わせた値を出力してください。*/

class prob60{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int [n];
    int ans = 0;
    for (int i = 0;i < n ;i++ ) {
    A[i] = sc.nextInt();
      if(A[i] >= 5){
        ans += A[i];
      }
    }
    System.out.println(ans);
  }
}
