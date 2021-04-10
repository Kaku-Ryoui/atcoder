import java.util.*;

/* 問題文
N 枚の投票用紙があり、i (1≤i≤N) 枚目には文字列 Si が書かれています。
書かれた回数が最も多い文字列を全て、辞書順で小さい順に出力してください。
制約
・1≤N≤2×10^5
・Si は英小文字のみからなる文字列 (1≤i≤N)
・Si の長さは 1 以上 10 以下 (1≤i≤N)
javac -encoding utf-8 Main.java */

class abc155_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Integer> map = new TreeMap<>();
		int max = 0;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (map.containsKey(s)) {
				map.put(s,map.get(s) + 1);
			} else {
				map.put(s,1);
			}
			max = Math.max(max, map.get(s));
		}
		for (String key : map.keySet()) {
			if (map.get(key) == max) {
				System.out.println(key);
			}
		}
	}
}
