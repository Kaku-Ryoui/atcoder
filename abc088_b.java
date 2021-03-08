import java.util.*;

/* 問題文
N 枚のカードがあります. i 枚目のカードには, a i という数が書かれています.
Alice と Bob は, これらのカードを使ってゲームを行います.
ゲームでは, Alice と Bob が交互に 1 枚ずつカードを取っていきます.
Alice が先にカードを取ります.2 人がすべてのカードを取ったときゲームは終了し,
取ったカードの数の合計がその人の得点になります.
2 人とも自分の得点を最大化するように最適な戦略を取った時,
Alice は Bob より何点多く取るか求めてください.
制約
N は 1 以上 100 以下の整数
a i ( 1 ≤ i ≤ N ) は 1 以上 100 以下の整数
 */

class abc088_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int [N];
    for (int i = 0; i < N; i++){
      A[i] =sc.nextInt();
    }
    //小さい順番で並び替える
    Arrays.parallelSort(A);
    int sum = 0;
    //総枚数N－１が配列数
    for(int i = N-1; i >= 0 ; i -= 2){
    // もし０でぴったりなら総取り
      if (i == 0){
        sum += A[0];
      }else{
        sum += A[i]-A[i-1];
      }
    }
    System.out.println(sum);
  }
}
