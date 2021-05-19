import java.util.*;

/* 問題文
すけぬ君は、N 階建てのビルを建てました。
ビルにはエレベーターが 1 基あり、すべての階に止まります。
すけぬ君は、各階に上下の方向ボタンを設置しましたが、うっかりしていたため、
どの階にも上向きか下向きの片方のボタンしかありません。
そのため、どの階からも上か下のどちらかにしか進むことができません。
Si が U のとき i 階には上向きのボタンしかなく、上にしか進めないことを、D のとき下向きのボタンしかなく、
下にしか進めないことを表します。
ある階から目的の階へと移動したい住民は、仕方がないので必要があれば他の階を経由して目的の階へと向かうことにしました。
全ての階の順序対 (i,j) についての、i 階から j 階へ行くときのエレベーターに乗る回数の最小値の合計を求めてください。
制約
・2≦|S|≦105
・Si は U または D である
・S1 は U である
・S|S| は D である

javac -encoding utf-8 Main.java  */

class agc015_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long ans = 0;
  		for(int i=0;i<S.length();i++){
  			if(S.charAt(i)=='U'){
  				ans += ((S.length()-1)-i)+i*2;
  			}else{
  				ans += ((S.length()-1)-i)*2+i;
  			}
  		}
  		System.out.println(ans);
  	}
  }
