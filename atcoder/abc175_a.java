import java.util.*;

/* 問題文
AtCoder 町の、ある連続した 3 日間の天気の記録があります。
天気の記録は長さ 3 の文字列 S で表され、 i ( 1 ≤ i ≤ 3 ) 日目の天気は i 文字目が S のとき晴れ、
R のとき雨でした。 天気が雨である日が連続していた最大の日数を求めてください。
制約
| S | = 3
S の各文字は S または R である
   */

  public class abc175_a {
   	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   		String s = sc.next();
   		System.out.println(s.equals("RRR") ? 3 : s.contains("RR") ? 2 : s.contains("R") ? 1 : 0);
   	}
   }



// 上手くいかんかった。
// class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     String S = sc.next();
//     if(S.charAt(0) == 'R' && S.charAt(1) == 'R' && S.charAt(2) == 'R'){
//         System.out.println(3);
//     }else if(S.charAt(0) == 'R' && S.charAt(1) == 'R'&& S.charAt(2) == 'S'||S.charAt(0) == 'S' &&S.charAt(1) == 'R' && S.charAt(2) == 'R'){
//         System.out.println(2);
//     }else if(S.charAt(0) == 'S' && S.charAt(1) == 'S'&& S.charAt(2) == 'R'||S.charAt(0) == 'R' && S.charAt(1) == 'S' && S.charAt(2) == 'S'||S.charAt(0) == 'S' && S.charAt(1) == 'R' && S.charAt(2) == 'S'){
//         System.out.println(1);
//     }else{
//         System.out.println(0);
//     }
//   }
// }
