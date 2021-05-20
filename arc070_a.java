import java.util.*;

/* 問題文
無限に左右に伸びている数直線上の 0 の地点に時刻 0 にカンガルーがいます。
カンガルーは時刻 i−1 から i にかけて、なにもしないか、もしくは長さがちょうど i のジャンプを、
左右どちらかの方向を選んで行えます。
つまり、時刻 i−1 に座標 x にいたとすると、時刻 i には x−i, x, x+i のどれかに存在することが出来ます。
カンガルーの家は座標 X にあります。カンガルーはできるだけ早く座標 X まで移動しようとしています。
カンガルーが座標 X に到着する時刻の最小値を求めてください。
制約
・X は整数
・1≦X≦109
javac -encoding utf-8 Main.java */

class arc070_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long c = 0;
    long sum = 0;
    while (sum < x){
        c++;
        sum += c;
    }

            System.out.println(c);

}
}
