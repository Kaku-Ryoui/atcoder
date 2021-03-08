import java.util.*;
/* あなたは英語の文法チェック・修正システムの作成を担当しています。 このシステムを実現するには、英単語を複数形に変換する機能が必要です。

単語の複数形への変換は、次のルールに従い行われます。

・末尾が s, sh, ch, o, x のいずれかである英単語の末尾に es を付ける
・末尾が f, fe のいずれかである英単語の末尾の f, fe を除き、末尾に ves を付ける
・末尾の1文字が y で、末尾から2文字目が a, i, u, e, o のいずれでもない英単語の末尾の y を除き、末尾に ies を付ける
・上のいずれの条件にも当てはまらない英単語の末尾には s を付ける

入力された英単語を複数形に変換するプログラムを作成してください。

※必ずしも実在の英単語が入力されるわけではありません。単純に文字列を上記のルールに沿って変換するプログラムを作成してください。 */

class B021{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String A[] = new String [n];
    for (int i = 0; i < n; i++){
      A[i]=sc.next();
      if(A[i].endsWith("s")||A[i].endsWith("sh")||A[i].endsWith("ch")||A[i].endsWith("o")||A[i].endsWith("x")){
        System.out.println(A[i]+"es");
      }else if(A[i].endsWith("f")){
        System.out.println(A[i].replace("f","ves"));
      }else if(A[i].endsWith("fe")){
      System.out.println(A[i].replace("fe","ves"));
      }else if(A[i].endsWith("y")){
          System.out.println((A[i].substring(A[i].length()-2,A[i].length()-1).equals("a"))?A[i]+"s":(A[i].substring(A[i].length()-2,A[i].length()-1).equals("i"))?A[i]+"s":(A[i].substring(A[i].length()-2,A[i].length()-1).equals("u"))?A[i]+"s":(A[i].substring(A[i].length()-2,A[i].length()-1).equals("e"))?A[i]+"s":(A[i].substring(A[i].length()-2,A[i].length()-1).equals("o"))?A[i]+"s":A[i].replace("y","ies"));
      }else{
        System.out.println(A[i]+"s");
      }
      }
    }
  }
