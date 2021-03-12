import java.util.*;

/* 問題文
あなたは鍋と N 個の具材を持っています。各具材は 価値 と呼ばれる実数の値を持ち、i 個目 (1≤i≤N) の具材の価値は vi です。
2 個の具材を鍋に入れると、それらは消滅して新たに 1 個の具材が生成されます。この新たな具材の価値は元の 2 個の具材の価値を x,y として (x+y)/2 であり、この具材を再び鍋に入れることもできます。
この具材の合成を N−1 回行うと、最後に 1 個の具材が残ります。この具材の価値として考えられる最大の値を求めてください。
javac -encoding utf-8 Main.java */

class abc138_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int v[] = new int [N];
    for(int i = 0 ; i < N; i++) {
      v[i] = sc.nextInt();
    }
    Arrays.sort(v);
    double ans = v[0];
    for (int i = 1; i <N; i++){
      ans = (ans + v[i])/2;
    }
    System.out.println(ans);
  }
}
