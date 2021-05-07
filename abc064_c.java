import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class abc064_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c[] = new int[9];
    for(int i = 0; i < n; i++){
      int r = sc.nextInt();
      if(r > 3200){
        c[8]++;
      }else{
        c[r/400]++;
      }
    }
    int min =0 , max =0;

    for(int i = 0; i < 8; i++){
      if(c[i] > 0)min++;
    }
    max = min + c[8];
    if(min == 0)min++;
    System.out.println(min + " " + max);
  }
}
