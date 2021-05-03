import java.util.*;

/* 問題文
筋力をつけたい高橋君は、AtCoder 社のトレーニング設備で、トレーニングをすることにしました。
AtCoder 社のトレーニング設備には N 個のボタンがついており、ちょうど 1 個のボタンが光っています。
 ボタンには、1 から N までの番号がついています。 ボタン i が光っているときにそのボタンを押すと、
ボタン i の明かりが消え、その後ボタン ai が光ります。i=ai であることもあります。
光っていないボタンを押しても、何も起こりません。最初、ボタン 1 が光っています。
高橋君は、ボタン 2 が光っている状態で、トレーニングをやめたいと思っています。
そのようなことは可能かどうか判定し、もし可能なら最低で何回ボタンを押す必要があるかを求めてください。
制約
・2≦N≦10^5
・1≦ai≦N
javac -encoding utf-8 Main.java  */

class abc065_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];

    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    int tmp = a[0];
    int cnt = 1;
    while (tmp != 2){ //tmpが２になったタイミングで条件から外れる
      tmp = a[tmp - 1];
      cnt++;
      if(cnt > n){
        cnt = -1;
        break;
      }
    }
    System.out.println(cnt);
  }
}
