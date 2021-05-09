import java.util.*;

/* 問題文j
日本でよく使われる紙幣は、10000 円札、5000 円札、1000 円札です。
以下、「お札」とはこれらのみを指します。青橋くんが言うには、彼が祖父から受け取ったお年玉袋には
お札が N 枚入っていて、合計で Y 円だったそうですが、嘘かもしれません。
このような状況がありうるか判定し、ありうる場合はお年玉袋の中身の候補を一つ見つけてください。
なお、彼の祖父は十分裕福であり、お年玉袋は十分大きかったものとします。
制約
・1≤N≤2000
・1000≤Y≤2×10^7
・N は整数である。
・Y は 1000 の倍数である。
javac -encoding utf-8 Main.java */

class abc085_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long Y = sc.nextLong();

    long num_10000 = -1;
    long num_5000 = -1;
    long num_1000 = -1;

    long target = Y -1000 * n;
    long tmp = -1;
    for(int x = 0 ;x <= n;x++){
      if((target - 9000 * x) % 4000 == 0){
        tmp = (target - 9000 * x)/ 4000;
        if((tmp >= 0) && (n - tmp -x) >= 0){
          num_10000 = x;
          num_5000 = tmp;
          num_1000 = n - num_10000 - num_5000;
          break;
        }
      }
    }
    System.out.println(num_10000+" "+num_5000+" "+num_1000);
  }
}

// 時間超過
// class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int Y = sc.nextInt();
//     for(int x = 0;x <= n;x++){
//       for(int y = 0;y <= n;y++){
//         for(int z = 0;z <= n;z++){
//           if(x + y + z == n && 10000 * x + 5000 * y + 1000 * z == Y){
//             System.out.println(x+" "+y+" "+z);
//             return;
//           }
//         }
//       }
//     }
//     System.out.println("-1"+" "+"-1"+" "+"-1");
//   }
// }
