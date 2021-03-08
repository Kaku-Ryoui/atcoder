import java.util.*;

/* 問題文
シカのAtCoDeerくんは二つの正整数 a , b を見つけました。 a と b をこの順につなげて読んだものが平方数かどうか判定してください。 制約 1 ≤ a , b ≤ 100 a , b は整数 */
public class Main{
   static void solve(){
    Scanner sc = new Scanner(System.in);
    double k = Double.parseDouble(sc.next()+sc.next());
    int t = (int)Math.sqrt(k);
    System.out.println(t*t==k ? "Yes" : "No");
    sc.close();
      }

  public static void main(String args[]){
        solve();
      }
}
