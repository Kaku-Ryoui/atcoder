import java.util.*;

/* 問題文
左右一列に N 枚のタイルが並んでおり、各タイルの初めの色は長さ N の文字列 S で表されます。
左から i 番目のタイルは、S の i 番目の文字が 0 のとき黒色で、1 のとき白色で塗られています。
あなたは、いくつかのタイルを黒色または白色に塗り替えることで、どの隣り合う 2 枚のタイルも異なる色で塗られているようにしたいです。
最小で何枚のタイルを塗り替えることで条件を満たすようにできるでしょうか。
制約
・1≤|S|≤10^5
・Si は 0 または 1 である。
javac -encoding utf-8 Main.java */


public class abc124_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();

		int A = 0;
		int B = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0' ^ i % 2 == 0) {
				A++;
			} else {
				B++;
			}
		}
		System.out.println(Math.min(A, B));

	}
}


// ■型が合わない
// class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     String S = sc.next();
//     int ans = S.length();
//
//     // iは最初に使う色（0または1）
//     for(int i = 0; i < 2; i++){
//       char c = '0';
//       if (i == 1){
//         c = '1';
//       }
//       int cnt = 0;
//       for(int j = 0; j < S.length(); j++){
//         // (char)(0 + '0') -> '0';
//         // (char)(1 + '0') -> '1';
//           // if(j %2 == 0 && S[j] == (char)(i + '0')){
//           //   cnt++;
//           // }
//           // if(j %2 == 0 && S[j] != (char)(i + '0')){
//           //   cnt++;
//           // }
//         if((j %2 == 0) ^ (S == (char)(i + '0'))){
//           cnt++;
//         }
//       }
//       ans = Math.min(ans,cnt);
//     }
//     System.out.println(ans);
//   }
// }
