import java.util.*;

/* 問題文
すぬけ君は、次のルールに従い、長さ N の文字列 t を長さ N−1 の文字列 t′ へ変えることができます。
各 i (1≤i≤N−1) について、t′ の i 文字目は t の i, i+1 文字目のどちらかである。
英小文字のみからなる文字列 s があります。
すぬけ君の目標は、s に上記の操作を繰り返し行い、s が単一の文字のみからなるようにすることです。
目標を達成するために必要な操作回数の最小値を求めてください。
制約
1≤|s|≤100
s は英小文字のみからなる。
javac -encoding utf-8 Main.java */

class agc016_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int min = Integer.MAX_VALUE;
    for(char c = 'a'; c <= 'z';c++){
      int m = 0;//初期化
      String ws[] = s.split(String.valueOf(c));//a-zを起点に配列化。その時のa-zを排除
      // System.out.println(Arrays.toString(ws));//確認用
      for(String w : ws){
        m = Math.max(m , w.length());
      }
      min = Math.min(m , min);
    }
    System.out.println(min);
  }
}
