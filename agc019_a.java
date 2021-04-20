import java.util.*;

/* 問題文
あなたは行きつけの店、インフバリューにアイスティーを買いに来ています。
この店では、様々なサイズのボトル入りアイスティーが様々な価格で売られています。
具体的な価格は、0.25 リットルサイズが一つ Q 円、0.5 リットルサイズが一つ H 円、
1 リットルサイズが一つ S 円、2 リットルサイズが一つ D 円です。
各サイズの在庫は無限にあります。あなたはちょうど N リットルのアイスティーを買いたいです。
これに必要な金額は何円でしょうか？
制約
・1≤Q,H,S,D≤10^8
・1≤N≤10^9
・入力値はすべて整数である。

javac -encoding utf-8 Main.java */
class agc019_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    int h = sc.nextInt();
    int s = sc.nextInt();
    int d = sc.nextInt();
    long n = sc.nextLong();
    // long max = Math.max(Math.max(q * 4,h * 2),Math.max(s,d/ 2));
    int x = Math.min(4*q,Math.min(s,2*h)); //1リットルあたりの最小
    long ans = Math.min(d*(n/2) + x * (n%2),x * n);

    System.out.println(ans);
  }
}

//制限時間オーバー
// class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int q = sc.nextInt();
//     int h = sc.nextInt();
//     int s = sc.nextInt();
//     int d = sc.nextInt();
//     long n = sc.nextLong();
//     // long max = Math.max(Math.max(q * 4,h * 2),Math.max(s,d/ 2));
//     long ans = Long.MAX_VALUE;
//
//     for(long i = 0; i <= 4 * n; i++){
//       for(long j = 0; j <= 4 * n; j++){
//         for(long k = 0; k <= 4 * n; k++){
//           for(long l = 0; l <= 4 * n; l++){
//             if(n == (i / 4)  + (j / 2) + k + (2 * l)){
//               ans = Math.min(ans,i * q  + j * h + k * s + l * d);
//             }
//           }
//         }
//       }
//     }
//     System.out.println(ans);
//   }
// }
