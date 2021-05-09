import java.util.*;

/* 問題文
長さ N の数列 a=(a1,a2,...,aN) があります。
各 ai は正の整数です。すぬけ君の目標は、a の要素を自由に並べ替え、次の条件が成り立つようにすることです。
各 1≤i≤N−1 について、ai と ai+1 の積は 4 の倍数である。
すぬけ君が目標を達成できるか判定してください。
制約
・2≤N≤10^5
・ai は整数である。
・1≤ai≤10^9

javac -encoding utf-8 Main.java */

class arc080_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fc = 0;
    int oddC=0,evenC=0;
    int t = n;
    while(t-- > 0){
      int a = sc.nextInt();
      if(a % 4 ==0){
        fc++;
      }else if(a % 2 == 0){
        evenC++;
      }else{
        oddC++;
      }
    }
      if(evenC > 0)oddC++;
      if(oddC - 1 <= fc || oddC ==0){//奇数がゼロもしくは、奇数-1よりも四の倍数が多い時
        System.out.println("Yes");
        return;
      }else{
        System.out.println("No");
      }
  }
}
