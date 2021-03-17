import java.util.*;

/* 問題文
ある合宿におやつとしてチョコレートが何個か準備されました。
合宿は N 人が参加して D 日間行われました。
i 人目の参加者 (1≤i≤N) は合宿の 1,Ai+1,2Ai+1,... 日目にチョコレートを 1 個ずつ食べました。
その結果、合宿終了後に残っていたチョコレートは X 個となりました。
また、合宿の参加者以外がチョコレートを食べることはありませんでした。
合宿開始前に準備されていたチョコレートの個数を求めてください。
制約
・1≤N≤100
・1≤D≤100
・1≤X≤100
・1≤Ai≤100 (1≤i≤N)
  */

class abc092_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int ans = 0;
    int arr[] = new int [N];
    for(int i = 0; i < N; i++){
      arr[i] = sc.nextInt();
    for(int j = 0; (j * arr[i]) + 1 <= D; j++ ){
          ans++;
        }
      }
      ans += X;
      System.out.println(ans);
    }
  }
