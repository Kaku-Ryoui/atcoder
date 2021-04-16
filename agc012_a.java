import java.util.*;

/* 問題文
AtCoder Group Contestの参加者に 3N 人が参加します。
i 番目の参加者の 強さ は整数 ai で表されます。
参加者が 3 人 1 組となるようにチームを N 組作ることにしました。
1 人の参加者が複数のチームに所属することはできません。
チームの強さはチームメンバーの強さのうち 2 番目に大きい値で表されます。
例えば、強さが 1,5,2 のメンバーからなるチームの強さは 2 になり、
強さが 3,2,3 のメンバーからなるチームの強さは 3 になります。
N 組のチームの強さの和としてありうる値のうち、最大の値を求めてください。
制約
・1≦N≦10^5
・1≦ai≦10^9
・ai は整数

javac -encoding utf-8 Main.java */

class agc012_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[3 * n];
    for(int i = 0; i < a.length; i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    long ans = 0;
    for(int i = n; i < a.length; i += 2){
      ans += (long)a[i];
    }
    System.out.println(ans);
  }
}
