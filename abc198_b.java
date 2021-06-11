import java.util.*;

/* 問題文
整数 N が与えられます。
N を十進法で表した文字列の先頭に 0 個以上の 0 をつけることで、回文にすることはできますか？
制約
0≤N≤10^9
javac -encoding utf-8 Main.java  */

class abc198_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int cnt = 0;
    //末尾に0がいくつ含まれているかの確認
    for(int i = n.length()-1; i >= 0; i--){
      if(n.charAt(i) == '0'){
        cnt++;
      }else{
        break;
      }
    }

    // 末尾に含まれている0をせんとうに追加
    for(int i = 0; i < cnt; i++){
      n = '0' + n;
    }


    for(int i = 0; i < n.length(); i++){
      // i番目と末尾からi番目が不一致ならno
      if(n.charAt(i) != n.charAt((n.length() -1) - i)){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
