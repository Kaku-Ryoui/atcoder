import java.util.*;

/* 問題文javac -encoding utf-8 Main.java  */

public class abc082_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next(),t=sc.next();
		char[] c1=s.toCharArray(),c2=t.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		String ss= new String(c1);
		String ts= new String(c2);

		 ts= new StringBuilder(ts).reverse().toString();
		System.out.println(ss.compareTo(ts)<0?"Yes":"No");

	}
}

// public class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     char[] s = sc.next().toCharArray();
//     char[] t = sc.next().toCharArray();
//     if(possible(s,t)){
//       System.out.println("Yes");
//     }else{
//       System.out.println("No");
//     }
//   }
//
// private static boolean possible(char[] s , char[] t){
//   Arrays.sort(s);
//   Arrays.sort(t);
//   reverse(t);
//   for(int i = 0; i < s.length && i < t.length; i++){
//     if(s[i] < t[i])return true;
//     if(s[i] > t[i])return false;
//   }
//   return s.length < t.length;
// }
//
// private static void reverse(char[] a){
//   int i = 0;
//   int j = a.length -1;
//   while(i < j){
//     char tmp = a[i];
//     a[i] = a[j];
//     a[j] = tmp;
//     i++;
//     j--;
//   }
// }
// }
