import java.util.*;

/* 問題文
AtCoder国には N 個の山があり、i 個目の山の名前は Si, 高さは Ti です。
2 番目に高い山の名前を答えてください。
N 個の山の名前、高さはそれぞれ相異なることが保証されます。
制約
・2≤N≤1000
・1≤(Si の長さ)≤15
・1≤Ti≤10＾5
・Si≠Sj (i≠j)
・Ti≠Tj (i≠j)
・Si は英小文字、英大文字、数字のみからなる
・N, Ti は整数

javac -encoding utf-8 Main.java  */

public class abc201_b {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    int[] t = new int[n], sub = new int[n];
    for(int i=0; i<n; i++){
      s[i]=sc.next();
      t[i]=sc.nextInt();
      sub[i]=t[i];
    }
    Arrays.sort(t);
    for(int i=0; i<n; i++){
      if(t[n-2]==sub[i]){
        System.out.println(s[i]);
      }
    }
  }
}
