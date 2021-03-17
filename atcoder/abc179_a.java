import java.util.*;

/* 問題文
AtCoder 王国では、英小文字を用いる高橋語という言語が使われています。
高橋語では、名詞の複数形は次のルールで綴られます。
単数形の末尾が s 以外なら、単数形の末尾に s をつける 単数形の末尾が s なら、
単数形の末尾に es をつける 高橋語の名詞の単数形 S が与えられるので、
複数形を出力してください。
制約 S は長さ 1 以上 1000 以下の文字列 S は英小文字のみを含む */
class abc179_a{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    System.out.println(s.endsWith("s")?(s+"es"):(s+"s"));
  }
}
