import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */


class abc200_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int k = sc.nextInt();
    String str = "";

    for(int i = 0; i < k; i++){
      if(n % 200 == 0){
        n = n / 200;
      }else{
        str = Long.toString(n) + "200";
        n = Long.parseLong(str);
      }
    }
    System.out.println(n);
  }
}
