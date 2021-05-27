import java.util.*;

/* 問題文
問題文
すぬけ君は a、b、c の 3 種類の文字のみからなる文字列 S を持っています。
回文恐怖症のすぬけ君は S の文字を自由に並び替えて、
2 文字以上の回文を部分文字列として含まないようにしようと思いました。
これが可能かどうかを判定して下さい。
制約
1≤|S|≤105
S は a、b、c 以外の文字を含まない。

javac -encoding utf-8 Main.java  */

class cf17_final_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray(); //配列化
		int[] count = new int[3];//abcの三種類
		int n = s.length;
		for(int i=0;i<n;i++) {
      System.out.println(s[i]-'a');
			count[s[i]-'a']++;
		}
		Arrays.sort(count);
		System.out.println(count[2] - count[0] <= 1 ? "YES" : "NO");
	}
}
