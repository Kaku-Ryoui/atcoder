import java.util.*;

/* 問題文
高橋君はお酒を N 杯飲みました。
i 番目に飲んだお酒は、量が Vi ml、アルコール度数が Pi % です。
高橋君はアルコールの摂取量が X ml を超えると酔っ払います。
高橋君が酔っ払ったのは何杯目のお酒を飲んでいるときですか。
ただし、N 杯全てのお酒を飲んだあとでも酔っ払っていない場合は、かわりに -1 を出力してください。
制約
・入力は全て整数
・1≤N≤10^3
・0≤X≤10^6
・0≤Pi≤100
・1≤Vi≤10^3
javac -encoding utf-8 Main.java  */

class abc189_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int v[] = new int[n];
    int p[] = new int[n];
    int x = sc.nextInt();
    int res = 0;
    for(int i = 0; i < n; i++){
      v[i] = sc.nextInt();
      p[i] = sc.nextInt();
      res += v[i] * p[i];
      if(res > x * 100){
        System.out.println(i + 1);
        return;
      }
    }
    System.out.println(-1);
  }
}
