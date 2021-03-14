import java.util.*;

/* 問題文javac -encoding utf-8 Main.java  */

class hitachi2020_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();   //冷蔵庫の種類
    int a[] = new int[A];   //冷蔵庫の値段
    int B = sc.nextInt();   //電子レンジの種類
    int b[] = new int[B];   //電子レンジの値段
    int M = sc.nextInt();   //M種類の割引券
    int x[] = new int[M];   //割引後の冷蔵庫
    int y[] = new int[M];   //割引後の電子レンジの値段
    int c[] = new int[M];   //安くなった値段
    int ans = 200000;       //金額の最小値(比較として最も大きい数字を代入)

    for(int i = 0; i < A; i ++){
      a[i] = sc.nextInt();
    }
    for(int j = 0; j < B; j ++){
      b[j] = sc.nextInt();
    }
    for (int k = 0; k < M; k++){
      x[k] = sc.nextInt();
      y[k] = sc.nextInt();
      c[k] = sc.nextInt();
    }

    for (int k = 0; k < M; k++){
        ans = Math.min(ans,a[x[k]-1] + b[y[k]-1] - c[k]);
    }

    Arrays.sort(a);
    Arrays.sort(b);
    if(ans > a[0] + b[0]){
      ans = a[0] + b[0];
    }
    System.out.println(ans);
  }
}
