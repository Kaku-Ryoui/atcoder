import java.util.*;

/* 問題文javac -encoding utf-8 Main.java  */

class keyence2019_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String target = "keyence";
    String S = sc.next();
    for(int i = 0; i < target.length(); i++){
      if(S.startsWith(target.substring(0,i)) && S.endsWith(target.substring(i))){
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}
