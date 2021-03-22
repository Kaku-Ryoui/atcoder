import java.util.*;

/* 問題文
N 枚の ID カードと M 個のゲートがあります。
i 番目のゲートは Li,Li+1,...,Ri 番目の ID カードのうちどれか 1 枚を持っていれば通過できます。
1 枚だけで全てのゲートを通過できる ID カードは何枚あるでしょうか。
制約
・入力は全て整数である。
・1≤N≤10＾5
・1≤M≤10＾5
・1≤Li≤Ri≤N
javac -encoding utf-8 Main.java */

class abc127_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l[] = new int[m];
    int r[] = new int[m];
    int maxL = 1;
    int minR = n;

    for(int i = 0; i < m; i++){
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
      maxL = Math.max(maxL,l[i]);
      minR = Math.min(minR,r[i]);
    }
    // 区間の長さは＋1
    int ans = minR - maxL + 1;
    ans = Math.max(ans,0);
    System.out.println(ans);
  }
}
