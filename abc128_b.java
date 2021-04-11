import java.util.*;

/* 問題文
あなたは美味しいレストランを紹介する本を書くことにしました。
あなたは N 個のレストラン、レストラン 1、レストラン 2、…、レストラン N を紹介しようとしています。
レストラン i は Si 市にあり、あなたは 100 点満点中 Pi 点と評価しています。
異なる 2 個のレストランに同じ点数がついていることはありません。
この本では、次のような順でレストランを紹介しようとしています。
・市名が辞書順で早いものから紹介していく。
・同じ市に複数レストランがある場合は、点数が高いものから紹介していく。
この本で紹介される順にレストランの番号を出力してください。
制約
・1≤N≤100
・S は英小文字のみからなる長さ 1 以上 10 以下の文字列
・0≤Pi≤100
・Pi は整数
・Pi≠Pj (1≤i<j≤N)

javac -encoding utf-8 Main.java  */

class abc128_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Integer> rest = new TreeMap<String,Integer>();

      for(int i = 1; i < n + 1; i++){
        String s = sc.next();
        int p = sc.nextInt();
        rest.put(s+(200-p),i);
      }

    for(String key : rest.keySet()){
      System.out.println(rest.get(key));
    }
  }
}
