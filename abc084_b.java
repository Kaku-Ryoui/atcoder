import java.util.*;

/* 問題文
Atcoder国では、郵便番号は A+B+1 文字からなり、A+1 文字目はハイフン -、それ以外の全ての文字は 0 以上 9 以下の数字です。
文字列 S が与えられるので、Atcoder国の郵便番号の形式を満たすかどうか判定してください。
制約
・1≦A,B≦5
・|S|=A+B+1
・S は 0 以上 9 以下の数字、およびハイフン - からなる
javac -encoding utf-8 Main.java  */
import java.util.Scanner;

public class abc084_b {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String s = sc.next();
		sc.close();
		System.out.println(s.matches("[0-9]{" + a + "}-[0-9]{" + b + "}") ? "Yes" : "No");
	}
}


// // ■自分の回答
// class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int A = sc.nextInt();
//     int B = sc.nextInt();
//     String S = sc.next();
//     int N = S.length();
//     int n = A + B  + 1 ;
//     char h = S.charAt(A);
//     boolean check = true;
//
//     if(!(n == N)){
//       check = false;
//     }else if(!(h == '-')){
//       check = false;
//     }else{
//       for(int i = 0 ; i < N; i++){
//         if(i == A){
//           continue;
//         }
//
//         if(S.charAt(i) == '-' ){
//           check = false;
//           break;
//         }
//       }
//     }
//     System.out.println(check?"Yes":"No");
//   }
// }
