import java.util.*;

/* 問題文
AtCoder 料理店では、以下の 5 つの料理が提供されています。
ここで、「調理時間」は料理を注文してから客に届くまでの時間とします。
・ABC 丼： 調理時間 A 分
・ARC カレー： 調理時間 B 分
・AGC パスタ： 調理時間 C 分
・APC ラーメン： 調理時間 D 分
・ATC ハンバーグ： 調理時間 E 分
また、この店には以下のような「注文のルール」があります。
・注文は、10 の倍数の時刻 (時刻 0,10,20,30,...) にしかできない。
・一回の注文につき一つの料理しか注文できない。
・ある料理を注文したら、それが届くまで別の注文ができない。ただし、料理が届いたちょうどの時刻には注文ができる。

E869120 君は時刻 0 に料理店に着きました。彼は 5 つの料理全てを注文します。
最後の料理が届く最も早い時刻を求めてください。
ただし、料理を注文する順番は自由であり、時刻 0 に注文することも可能とであるとします。

制約
A,B,C,D,E は 1 以上 123 以下の整数
javac -encoding utf-8 Main.java  */

// ■きれいな回答
public class abc123_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] Dish = new int[5];
    int time = 0;
    int max = 0;

    for(int i= 0; i < 5; i++){
      Dish[i] =sc.nextInt();
      if(Dish[i] % 10 == 0){
        time += Dish[i];
      }else{
        time += (10 - (Dish[i] % 10)) + Dish[i];
        max = Math.max(max,(10 - (Dish[i] % 10)));
      }
    }
    // 10-余りが最大の時、最短時間になる
    System.out.println(time - max);
  }
}

// ■自分の回答
// class abc123_b{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//
//     int a[] = new int[5];
//   	int b[] = new int[5];
//     int sum = 0;
//     int c = 0;
//     for(int i = 0; i < 5; i++){
//       a[i] = sc.nextInt();
//       sum += a[i];
//       // 10分台の余りがない時以外
//       if(a[i] % 10 != 0){
//         b[c] = 10 - (a[i]%10);
//         c++;
//       }
//     }
//     Arrays.sort(b);
//     for(int i = 0; i < 4; i++){
//       if(b[i] != 0){
//         sum += b[i];
//       }
//     }
//     System.out.println(sum);
//   }
// }
