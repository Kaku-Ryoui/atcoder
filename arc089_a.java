import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class arc089_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean canTravel = true;
    int T = 0, X = 0, Y =0;
    for(int i = 0; i < n; i++){
      int t = sc.nextInt(), x = sc.nextInt() , y = sc.nextInt();
      int diff = t - T - Math.abs(x - X) - Math.abs(y - Y);
      canTravel = ( diff % 2 == 0 && diff >= 0);
      T = t; X = x; Y = y;
    }
    System.out.println(canTravel ? "Yes" : "No");
  }
}
