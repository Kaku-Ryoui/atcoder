import java.util.*;

/* 問題文
w を、英小文字のみからなる文字列とします。
 w が以下の条件を満たすならば、w を美しい文字列と呼ぶことにします。
 ・どの英小文字も、w 中に偶数回出現する。
 文字列 w が与えられます。
 w が美しい文字列かどうか判定してください。
 制約
・ 1≤|w|≤100
 ・w は英小文字 (a-z) のみからなる文字列である
javac -encoding utf-8 Main.java  */

class abc044_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] c = sc.next().toCharArray();
    int[] occ = new int[26];
    for(int i = 0; i < c.length; i++){
      occ[c[i]- 'a']++;
    }
    for(int i = 0; i < 26; i++){
      if(occ[i] % 2 == 1){
        System.out.println("No");
        return;
      }
    }
        System.out.println("Yes");
  }
}
