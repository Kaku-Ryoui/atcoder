import java.util.*;
// import java.io.*;

/* 問題文javac -encoding utf-8 Main.java */

class abc088_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int c[][] = new int[3][3];

    for(int i = 0; i < 3; i++){
      String str[] = sc.nextLine().split(" "); //sc.next()だとNG
      for(int j = 0; j < 3; j++){
        c[i][j] = Integer.parseInt(str[j]);
      }
    }
    for(int i = 0; i < 3; i++){
      int s = c[(i + 1) % 3][0] - c[i][0];
      int t = c[(i + 1) % 3][1] - c[i][1];
      int u = c[(i + 1) % 3][2] - c[i][2];

      if( s != t || t != u || u != s){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}



// public class Main {
//
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
// 		int c[][] = new int[3][3];
//
// 		for (int i = 0; i < 3; i++) {
// 			String str[] = br.readLine().split(" ");
// 			for (int j = 0; j < 3; j++) {
// 				c[i][j] = Integer.parseInt(str[j]);
// 			}
// 		}
//
// 		for (int i = 0; i < 3; i++) {
// 			int s = c[(i + 1) % 3][0] - c[i][0];
// 			int t = c[(i + 1) % 3][1] - c[i][1];
// 			int u = c[(i + 1) % 3][2] - c[i][2];
//
// 			if (s != t || t != u || u != s) {
// 				System.out.println("No");
// 				return;
// 			}
// 		}
//
// 		System.out.println("Yes");
// 	}
// }
