import java.util.*;

/*問題文
高橋君は、N個の競技プログラミング用の問題をつくりました。それぞれの問題には1からN
の番号がついており、問題iの難易度は整数diで表されます(大きいほど難しいです)。

高橋君はある整数Kを決めることで、難易度がK以上ならば「ARC用の問題」
難易度がK未満ならば「ABC用の問題」
という風に、これらの問題を二種類に分類しようとしています。

「ARC用の問題」と「ABC用の問題」が同じ数になるような整数Kの選び方は何通りあるでしょうか。

制約
2≦N≦10^5
Nは偶数である。
1≦di≦10^5
入力は全て整数である。
javac -encoding utf-8 Main.java */

class abc132_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int [N];
    for(int i = 0; i < N; i++){
      d[i] = sc.nextInt();
    }
    Arrays.sort(d);

    System.out.println(d[N/2] - d[N/2-1]);
  }
}
