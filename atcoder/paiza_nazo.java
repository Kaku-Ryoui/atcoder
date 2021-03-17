import java.util.*;

/* 1行目の文字が、2行目の文字列の中に何個出現するかを
カウントして出力してください。 */

class paiza_nazo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String C = sc.next();
    String S = sc.next();
    int ans = 0;
    for(int i = 0; i < S.length(); i++){
      if(S.valueOf(charAt(i)).equals(C)){
        ans ++;
      }
    }
  }
}
