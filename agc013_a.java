import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class agc013_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc. nextInt();
    int a[] = new int[n];
    for(int i = 0; i < n; i++)a[i] = sc.nextInt();

    int pl = 0;
    int count = 1;

    for (int i = 1; i < n ;i++) {
      if (pl == 1 && a[i] - a[i -1] < 0) {
        count++;
        pl = 0;
      }else if(pl == -1 && a[i] - a[i -1] > 0){
        count++;
        pl = 0;
      }else{
        if(a[i] - a[i -1] > 0)pl = 1;
        else if(a[i] - a[i -1] < 0)pl = -1;
      }
    }
    System.out.println(count);
  }
}
