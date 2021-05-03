import java.util.*;

/* 問題文
N 匹のうさぎがいます。
うさぎには 1 から N まで番号が振られています。
各 1≤i≤N について、うさぎ i はうさぎ ai が好きです。
ただし、自分自身が好きなうさぎはいません。 すなわち、ai≠i です。
うさぎ i とうさぎ j のペア (i，j) (i＜j) が次の条件を満たすとき、ペア (i，j) は仲良しであるといいます。
うさぎ i はうさぎ j が好きであり、うさぎ j はうさぎ i が好きである。仲良しなペアの個数を求めてください。
制約
・2≤N≤10^5
・1≤ai≤N
・ai≠i
javac -encoding utf-8 Main.java  */

class codefestival_2016_qualA_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];

    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    int cnt = 0;

    for(int i = 0; i < n; i++){
      //配列a[i]の好きなうさぎj（a[i]-1番目）とウサギのナンバーは「＋1」
      if(a[a[i]-1] == i + 1){
        cnt++;
      }
    }

    System.out.println(cnt / 2);
  }
}
