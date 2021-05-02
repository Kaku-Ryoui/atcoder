import java.util.*;

/* 問題文
栄養ドリンクにレーティング上昇効果があると聞いた高橋くんは、M 本の栄養ドリンクを買い集めることにしました。
栄養ドリンクが売られている店は N 軒あり、i 軒目の店では 1 本 Ai 円の栄養ドリンクを Bi 本まで買うことができます。
最小で何円あれば M 本の栄養ドリンクを買い集めることができるでしょうか。
なお、与えられる入力では、十分なお金があれば M 本の栄養ドリンクを買い集められることが保証されます。
制約
入力は全て整数である。
・1≤N,M≤10^5
・1≤Ai≤10^9
・1≤Bi≤10^5
・B1+...+BN≥M
javac -encoding utf-8 Main.java */

class abc121_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // <キー、値> 今回は＜値段、本数＞　※TreeMapなのでキーが数値の場合は小さい順に要素が保持
    Map<Long,Long>map = new TreeMap<>();
    int n = sc.nextInt();
    int m = sc.nextInt();

    for(int i = 0; i < n; i++){
      long a = sc.nextLong();
      long b = sc.nextLong();
      // mapに値段を追加(put)
      // map.put(a , b + map.get(a));だと最初nullのままになるのでnullならb。
      // 値段(a)がnullではないか確認（containsKey）
      // nullでないなら二度目ということなので、本数を初回(b)に足す
      map.put(a , map.containsKey(a) ? b + map.get(a) : b );
    }

    long ans = 0;

    for(long price:map.keySet()){//キーをすべて取得(keySet())し、単体の変数として扱えるようにする
      if(m <= map.get(price)){//求めてる本数より最安ドリンクの本数が上回っているとき
        ans += price*m;
        break;
      }else{
        m -= map.get(price);// 残りの本数を減らす
        ans += price * map.get(price);//買った金額を加算
      }
    }
    System.out.println(ans);
  }
}
