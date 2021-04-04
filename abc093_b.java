import java.util.*;

/* 問題文
以下を満たす整数をすべて昇順に出力してください。
A 以上 B 以下の整数の中で、小さい方から K 番目以内であるか、大きい方から K 番目以内である
制約
・1≤A≤B≤10＾9
・1≤K≤100
・入力はすべて整数である
javac -encoding utf-8 Main.java  */

class abc093_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int    A    = sc.nextInt();
    int    B    = sc.nextInt();
    int    K    = sc.nextInt();
    int    u    = 0;

    if((B - A) <= K){
       for(int i = A; i <= B; i++){
           System.out.println(i);
           }
       }
    else{
        for(int i = A; i < A + K; i++){
            System.out.println(i);
            }
            // A + K以上とB - K + 1のどちらの数値が大きいか比較
        for(int i = Math.max(A + K, B - K + 1); i <= B; i++){
            System.out.println(i);
            }
        }
 }
}


// 自力回答断念。もっと早めに切り上げるべき。

// class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a =sc.nextInt();
//     int b =sc.nextInt();
//     int k =sc.nextInt();
//     int tmp[] = new int[b + 1];
//     int ans[] = new int[b + 1];
//     for(int i = a; i <= b; i++){
//       tmp[i] = i;
//     }
//     Arrays.sort(tmp);
//
//     for(int i = a; i < a + k; i++){
//       ans[i] = tmp[i];
//     }
//     for(int i = b; i > b - k; i--){
//       ans[i] = tmp[i];
//     }
//
//     Arrays.sort(ans);
//     for(int i = a; i <= b; i++){
//       System.out.println(ans[i]);
//     }
//   }
// }
