import java.util.*;

/* 問題文
N 人の子供がいます。
子供たちには 1,2,...,N と番号が振られています。
すぬけ君は、x 個のお菓子を子供たちに配ることにしました。
このとき、すぬけ君は x 個のお菓子をすべて配り切らなければなりません。
なお、お菓子を貰わない子供がいても構いません。
各 i (1≤i≤N) について、子供 i はちょうど ai 個のお菓子を貰うと喜びます。
すぬけ君は、お菓子を配る方法を工夫し、喜ぶ子供の人数を最大化しようとしています。
喜ぶ子供の人数の最大値を求めてください。
制約
・入力はすべて整数である。
・2≤N≤100
・1≤x≤10＾9
・1≤ai≤10＾9
javac -encoding utf-8 Main.java */

class agc027_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int a[] = new int [N];
    for(int i = 0; i < N; i++){
        a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int ans = 0;
    for(int i = 0; i < N; i++){
      if(x >= a[i]){
        x -= a[i];
        ans++;
      }else{
        x = 0;
      break;
      }
    }
    if(x>0){
      ans--;
    }
    System.out.println(ans);
  }
}
