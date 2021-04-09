// import java.util.*;
//
// /* 問題文
// 高橋君は無限に広い 2 次元平面上に住んでいて、N 日間の旅行をします。
// 高橋君の旅程は長さ N の文字列 S であり、はじめは家にいます。
//
// i(1≦i≦N) 日目には、
// ・S の i 文字目が N なら北に
// ・S の i 文字目が W なら西に
// ・S の i 文字目が S なら南に
// ・S の i 文字目が E なら東に
// 正の距離だけ移動します。
//
// 高橋君は、各日の移動距離は決めていません。各日の移動距離をうまく決めることで、
//  高橋君が N 日間の旅程をすべて消化したときに家にいるようにできるかどうか判定してください。
// 制約
// ・1≦|S|≦1000
// ・S は文字 N, W, S, E のみからなる。
//
// javac -encoding utf-8 Main.java */
//
// class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     String str = sc.next();
//     boolean n = str.contains("N");
//     boolean s = str.contains("S");
//     boolean w = str.contains("W");
//     boolean e = str.contains("E");
//     if(n == true && s == true && w == false && e == false){
//       System.out.println("Yes");
//     }else if(n == false && s == false && w == true && e == true){
//       System.out.println("Yes");
//     }else if(n == true && s == true && w == true && e == true){
//       System.out.println("Yes");
//     }else{
//       System.out.println("No");
//     }
//   }
// }



import java.util.Scanner;

public class agc003_a {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();

		if((str.contains("N") == str.contains("S")) && (str.contains("W") == str.contains("E"))){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
