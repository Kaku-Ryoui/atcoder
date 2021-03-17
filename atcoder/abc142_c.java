import java.util.*;

/* 問題文
高橋くんは N 人の生徒たちのいるクラスの担当教師です。
生徒たちには 1 から N までの出席番号が重複なく割り当てられています。
今日は全ての生徒たちが相異なるタイミングで登校しました。
高橋くんは、出席番号 i の生徒が登校した時点で、教室に Ai 人の生徒たちがいたことを記録しています(出席番号 i の生徒を含む)。
記録された情報を元に、生徒たちの登校した順番を復元してください。
javac -encoding utf-8 Main.java */

class abc142_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int [N];
    int ans[] = new int [N];

    // まず、Aの配列をすべて出す。
    for(int i = 0; i < N; i++){
      A[i] = sc.nextInt();
      ans[A[i] -1] = i + 1;
    }
    // ※まとめるとAの配列が取り出していないため、エラーになる。
    for(int j = 0; j < N; j++){
      System.out.println(ans[j] + " ");
    }
  }
}
