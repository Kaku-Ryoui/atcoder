import java.util.*;

/* 問題文
N 以下の正の整数の 10 進法での各桁の和の最大値を求めてください。
制約
・1≤N≤10^16
・N は整数である
javac -encoding utf-8 Main.java */

class agc021_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
			String N = sc.next();
			int digitSumN = N.charAt(0) - '0';

			for(int i = 1; i < N.length(); ++i){
				if(N.charAt(i) == '9'){
					digitSumN += 9;
				} else {
					break;
				}
			}

			int maxDigitSum = Math.max(digitSumN, N.charAt(0) - '0' - 1 + (N.length() - 1) * 9);

			System.out.println(maxDigitSum);
		}
	}
}

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         long n = sc.nextLong();
//         sc.close();
//
//         long ans = 0;
//         n = n+1;
//         while(n > 0){
//             if(n < 10){
//                 ans += n-1;
//             } else {
//                 ans +=9;
//             }
//             n /= 10;
//         }
//         System.out.println(ans);
//     }
// }
