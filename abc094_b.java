import java.util.*;

/* 問題文
N+1 個のマスが左右に一列に並んでいます． これらのマスには，左のマスから順に 0,1,...,N の番号が付けられています．
あなたは，最初マス X にいます．
 隣り合うマスの間は自由に移動することができ，マス 0 またはマス N にたどり着くとゴールすることができます．
 ただし，i=1,2,...,M について，マス Ai には料金所があり，そのためマス Ai に移動してくる際には 1 のコストがかかります．
 なお，マス 0，マス X，マス N には料金所がないことが保証されます．ゴールするまでにかかるコストの最小値を求めてください．
javac -encoding utf-8 Main.java  */

class abc094_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //0から最も離れたゴールマス
    int M = sc.nextInt(); //コスト＋1
    int X = sc.nextInt(); //最初のマス
    int Zcst = 0; //0までのコスト
    int Ncst = 0; //Nまでのコスト
    int ans = 0; //最小のコスト

    for(int i = 0; i < M; i++){
      int A = sc.nextInt();
      // 0もしくはNマスどちらが最小コストか場合分け
        if(A < X){
          Zcst++;
        }else{
          Ncst++;
        }
    }
    ans = Math.min(Zcst,Ncst);
    System.out.println(ans);
  }
}
