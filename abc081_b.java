import java.util.*;

/* 問題文
黒板に N 個の正の整数 A1,...,AN が書かれています．
すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます．
黒板に書かれている整数すべてを，2 で割ったものに置き換える．
すぬけ君は最大で何回操作を行うことができるかを求めてください．
制約
1≤N≤200
1≤Ai≤10^9
javac -encoding utf-8 Main.java  */

class abc081_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int ans = 0;
    for(int i = 0; i < N ; i++){
      A[i] = sc.nextInt();
    }
      while(true){
        // すべての数字の奇数判定
        boolean odd = false;
        for(int i = 0; i < N ; i++){
          if(A[i] % 2 == 1){
            odd = true;
          }
        }
        if(odd){
          break;
        }
        //奇数ではないならすべて偶数
        ans++;
        for(int i = 0; i < N ; i++){
          A[i] /= 2;
        }
      }
    System.out.println(ans);
    }
  }
