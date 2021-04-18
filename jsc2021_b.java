import java.util.*;

/* 問題文
狭義単調増加な整数列 A=(A1,A2,…,AN),B=(B1,B2,…,BM) があります。
A,B のどちらか片方にだけ出現する整数を全て求め、昇順に出力してください。
制約
入力は全て整数
・1≤N,M≤10^3
・1≤A1<A2<⋯<AN≤10^3
・1≤B1<B2<⋯<BM≤10^3
javac -encoding utf-8 Main.java  */

  public class jsc2021_b {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		int m = sc.nextInt();

    		Set<Integer> a = new HashSet<>();
    		for (int i=0; i<n; i++) {
    			a.add(sc.nextInt());
    		}

    		Set<Integer> b = new HashSet<>();
    		for (int i=0; i<m; i++) {
    			b.add(sc.nextInt());
    		}

    		Set<Integer> c = new TreeSet<>();

    		for (int i : a) {
    			if (!b.contains(i)) {
    				c.add(i);
    			}
    		}

    		for (int i : b) {
    			if (!a.contains(i)) {
    				c.add(i);
    			}
    		}

    		for (int i : c) {
    			System.out.println(i);
    		}
    	}
    }

// class jsc2021_b{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int a[] = new int[n];
//     int m = sc.nextInt();
//     int b[] = new int[m];
//     for(int i = 0; i < n;i++){
//       a[i] = sc.nextInt();
//     }
//     for(int i = 0; i < m;i++){
//       b[i] = sc.nextInt();
//     }
//     Arrays.sort(a);
//     Arrays.sort(b);
//
//     String ans = "";
//     int max = Math.max(a[n-1],b[m-1]);
//     boolean check = true;
//     for(int k = 0; k < max; k++){
//       for(int i = 0; i < n;i++){
//         check = true;
//         for(int j = 0; j < m;j++){
//           if(k + 1 == a[i] && k + 1 ==b[j]){
//             check = false;
//             break;
//           }
//         }
//         if(check == false){
//           break;
//         }
//       }
//       if(check == true){
//         if(ans.equals("")){
//           ans = Integer.toString(k + 1);
//         }else{
//           ans += " "+Integer.toString(k + 1);
//         }
//       }
//     }
//     System.out.println(ans);
//   }
// }
