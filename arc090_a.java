import java.util.*;

/* 問題文
2×N のマス目があります。上から i 行目、左から j 列目 (1≤i≤2, 1≤j≤N) のマスをマス (i,j) と表すことにします。
あなたははじめ、左上のマス (1,1) にいます。
あなたは、右方向または下方向への移動を繰り返し、右下のマス (2,N) に移動しようとしています。マス (i,j) には Ai,j 個のアメが置かれています。
あなたは移動中に通ったマスに置いてあるアメをすべて回収します。
左上および右下のマスにもアメが置かれており、あなたはこれらのマスに置かれているアメも回収します。
移動方法をうまく選んだとき、最大で何個のアメを回収できるでしょうか。
制約
・1≤N≤100
・1≤Ai,j≤100 (1≤i≤2, 1≤j≤N)

javac -encoding utf-8 Main.java */

class arc090_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[][] = new int[2][n];
    int sum1 = 0;
    int sum2 = 0;
    int ans = 0;
    int res = 0;
    int candy = 0;

    for(int i = 0; i < n; i++){
      a[0][i] = sc.nextInt();
      sum1 += a[0][i];
    }
    for(int j = 0; j < n; j++){
      a[1][j] = sc.nextInt();
      sum2 += a[1][j];
    }

    for(int i = 0; i < n; i++){
      res += a[0][i];
      sum1 -= a[0][i];
      // 下を選ぶ場合
      if(sum1 < sum2){
          candy += sum2 + res;
          ans = Math.max(ans,candy);
          candy = 0;
        }
      sum2 -= a[1][i];
    }
    System.out.println(ans);
  }
}
