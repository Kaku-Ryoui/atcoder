import java.util.*;

/* 問題文
ある国で、宮殿を作ることになりました。
この国では、標高が x メートルの地点での平均気温は T−x×0.006 度です。
宮殿を建設する地点の候補は N 個あり、地点 i の標高は Hi メートルです。
joisinoお姫様は、これらの中から平均気温が A 度に最も近い地点を選んで宮殿を建設するようにあなたに命じました。
宮殿を建設すべき地点の番号を出力してください。
ただし、解は一意に定まることが保証されます。
制約
・1≤N≤1000
・0≤T≤50−60≤A≤T
・0≤Hi≤10^5
・入力は全て整数解は一意に定まる

javac -encoding utf-8 Main.java  */
public class abc113_b {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int t = sc.nextInt();
int a = sc.nextInt();
double min = 999;
int minidx = 0;
for (int i = 0; i < n; i++) {
    double sa = Math.abs(a-(t-sc.nextInt()*0.006));
    if (min > sa) {
        min = sa;
        minidx = i;
    }
}
System.out.println(minidx+1);

}
}



// class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int h[] = new int[n];
//     int t = sc.nextInt();
//     int a = sc.nextInt();
//     double tmp_a = 100000;
//     int ans = 0;
//     for(int i = 0; i < n; i++){
//       h[i] = sc.nextInt();
//       double tmp = t - h[i] *6/1000;
//       tmp_a = Math.min (tmp_a,Math.abs(tmp - a));
//       if(tmp_a == Math.abs(tmp - a)){
//         ans = i + 1;
//       }
//     }
//     System.out.println(ans);
//   }
// }
