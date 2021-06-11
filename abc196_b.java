import java.util.*;

/* 問題文
整数または小数 X が与えられるので、小数点以下を切り捨てて整数で出力してください。
制約
・0≤X≤10＾100
・X は整数、または小数点以下が 100 桁以下の小数であり、先頭に余計な 0 は付かない
javac -encoding utf-8 Main.java  */

class abc196_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    int cnt = 0;
    for(int i = 0; i < x.length(); i++){
      if(x.charAt(i) == '.'){
        break;
      }
      cnt++;
    }
    System.out.println(x.substring(0,cnt));
  }
}
