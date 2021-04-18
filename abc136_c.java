import java.util.*;

/* 問題文
左右一列に N 個のマスが並んでおり、左から i 番目のマスの高さは Hi です。
あなたは各マスについて 1 度ずつ次のいずれかの操作を行います。
マスの高さを 1 低くする。何もしない。
操作をうまく行うことでマスの高さを左から右に向かって単調非減少にできるか求めてください。
制約
・入力は全て整数である。
・1≤N≤10^5
・1≤Hi≤10^9
javac -encoding utf-8 Main.java */

class abc136_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int prev = 0;
    for(int i = 0; i < n; i++){
      int h = sc.nextInt();
      if(h < prev){
        System.out.println("No");
        return;
      }else if(h > prev){
        prev = h - 1;
      }
    }
    System.out.println("Yes");
  }
}
