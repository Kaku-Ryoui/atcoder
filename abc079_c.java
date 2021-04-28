import java.util.*;

/* 問題文
駅の待合室に座っているjoisinoお姉ちゃんは、切符を眺めています。
切符には 4 つの 0 以上 9 以下の整数 A,B,C,D が整理番号としてこの順に書かれています。
A op1 B op2 C op3 D = 7 となるように、op1,op2,op3 に + か - を入れて式を作って下さい。
なお、答えが存在しない入力は与えられず、また答えが複数存在する場合はどれを出力してもよいものとします。
制約
・0≦A,B,C,D≦9
・入力は整数からなる
・答えが存在しない入力は与えられない
javac -encoding utf-8 Main.java */

class abc079_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int arr[] = new int[4]; //A,B,C,Dの四種類
    for(int i = 0; i < 4; i++){
      arr[i] = Character.getNumericValue(a.charAt(i));
    }

    for (int i=-1; i<=1; i+=2) {
      for (int j = -1; j <= 1; j+=2) {
        for (int k = -1; k <= 1; k+=2) {
          if (arr[0] + i*arr[1] + j*arr[2] + k*arr[3] == 7) {
            // 符号ありきの型でformatする「％＋ｄ」と書く、カンマ以下は引数
            System.out.println(String.format("%d%+d%+d%+d=7", arr[0], i*arr[1], j*arr[2], k*arr[3]));
            return;
          }
        }
      }
    }
  }
}
