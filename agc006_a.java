import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class agc006_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    String str1 = sc.next();
    for(int i = 0; i <n; i++){
      boolean flag = true;
      for (int j = 0;j + i < n;j++ ) {
        if (str1.charAt(j) == str.charAt(j + i)) continue;
        flag =false;
        break;
      }
      if(flag){
        System.out.println(n + i);
        return;
      }
    }
    System.out.println(2*n);
  }
}
