import java.util.*;

/* 問題文javac -encoding utf-8 Main.java  */

class abc098_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int shurui,max = 0;
    int n = sc.nextInt();
    String s = sc.next();
    for(int i = 0; i < n; i++){
      String ss = s.substring(0,i+1);
      String sss = s.substring(i+1,n);
      shurui = 0;
      for(char j = 'a'; j <= 'z';j++){
        String k = String.valueOf(j);
        if(sss.contains(k) && ss.contains(k))shurui++;
      }
      max=Math.max(shurui,max);
    }
    System.out.println(max);
  }
}
