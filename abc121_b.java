import java.util.*;

/* N 個のソースコードがあり、 i 個目のソースコードの特徴は A i 1 , A i 2 , . . . , A i M の M 個の整数で表されます。 また、整数 B 1 , B 2 , . . . , B M と 整数 C が与えられます。 A i 1 B 1 + A i 2 B 2 + . . . + A i M B M + C > 0 のときに限り、 i 個目のソースコードはこの問題に正答するソースコードです。 N 個のソースコードのうち、この問題に正答するソースコードの個数を求めてください。 制約 入力は全て整数である。 1 ≤ N , M ≤ 20 − 100 ≤ A i j ≤ 100 − 100 ≤ B i ≤ 100 − 100 ≤ C ≤ 100 */

class abc121_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		int crt = 0;
		for(int i=0;i<m;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			int a=0;
			for(int j=0;j<m;j++){
				a+=sc.nextInt()*b[j];
			}
			a+=c;
			if(a>0)crt++;
		}
		System.out.print(crt);
	}
}
