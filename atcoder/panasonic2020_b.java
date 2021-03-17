import java.util.*;

/* 問題文
縦 H マス、横 W マスの盤面があります。 この盤面の左上隅のマスに角行の駒が置かれています。 駒が 0 回以上の好きな回数の移動を繰り返して到達できるマス目は何個あるでしょうか？ ただし、角行の駒は斜めに動くものとします。 より厳密には、駒が上から r 1 番目、左から c 1 番目のマスから上から r 2 番目、左から c 2 番目のマス目に動ける条件は r 1 + c 1 = r 2 + c 2 r 1 − c 1 = r 2 − c 2 のうちちょうど一方が成立することです。たとえば、駒が図の位置にあるとき、一回で移動できる場所は赤くなっているマスです。 制約 1 ≤ H , W ≤ 10 9 入力は全て整数である。 */

class panasonic2020_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    if(h == 1 || w == 1) {
          System.out.println(1);
    }else{
          System.out.println((h*w + 1)/2);
    }
      sc.close();
  }
}
