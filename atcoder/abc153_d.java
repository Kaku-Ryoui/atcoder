import java.util.*;

/* 問題文
カラカルはモンスターと戦っています。
モンスターの体力は H です。
カラカルはモンスターを 1 体選んで攻撃することができます。
モンスターを攻撃したとき、攻撃対象のモンスターの体力に応じて、次のどちらかが起こります。
・モンスターの体力が 1 なら、そのモンスターの体力は 0 になる
・モンスターの体力が X>1 なら、そのモンスターは消滅し、体力が ⌊X/2⌋ のモンスターが新たに 2 体現れる
（「r」 は r を超えない最大の整数を表す）
全てのモンスターの体力を 0 以下にすればカラカルの勝ちです。
カラカルがモンスターに勝つまでに行う攻撃の回数の最小値を求めてください。
制約
・1≤H≤10^12
・入力中のすべての値は整数である。
javac -encoding utf-8 Main.java */

class abc153_d{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long H =sc.nextLong();
    long ans = 1;
    while(H > 1){
        ans *= 2;
        H /= 2;
        
      }

    System.out.println(2*ans - 1);
  }
}
