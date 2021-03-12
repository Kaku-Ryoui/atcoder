import java.util.*;

/* 問題文
  英大文字からなる文字列 S が与えられます。S の部分文字列 (注記を参照) であるような最も長い ACGT 文字列 の長さを求めてください。
  ここで、ACGT 文字列とは A, C, G, T 以外の文字を含まない文字列です。
注記
  文字列 T の部分文字列とは、T の先頭と末尾から 0 文字以上を取り去って得られる文字列です。
  例えば、ATCODER の部分文字列には TCO, AT, CODER, ATCODER, (空文字列) が含まれ、AC は含まれません。
制約
  S は長さ 1 以上 10 以下の文字列である。
  S の各文字は英大文字である。
javac -encoding utf-8 Main.java  */

class abc122_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int ans = 0; //ATCG文字列の最大
    int now = 0; //今見ている文字を末尾とするATCG文字列の最大長

    // for(int i = 0; i < S.length(); i++){
    //     if(S.charAt(i) == 'A'||S.charAt(i) == 'T'||S.charAt(i) == 'C'||S.charAt(i) == 'G'){
    // 上記を簡略化
    for(char c: S.toCharArray()) {
  			if(c=='A' || c=='C' || c=='G' || c=='T'){
          now++;
        }else{
          now =0;
        }
        ans = Math.max(now,ans);
      }
      System.out.println(ans);
    }
  }
