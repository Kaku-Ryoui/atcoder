import java.util.*;

// 高橋くんの家には電源プラグの差込口が1 口しかありません。
// そこで、高橋くんは A 個口の電源タップをいくつか使って未使用の差込口を
// B 口以上に拡張したいと考えています。
// A 個口の電源タップ 1 つと未使用の差込口 1 口を使って、新たに差込口を
// A 口増やすことができます。
// 最小でいくつの電源タップが必要でしょうか。

class Abc139_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;

		while(1+c*(a-1) < b) c++;

		System.out.println(c);
  }
}
