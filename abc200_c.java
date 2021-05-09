import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class abc200_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int counter[] = new int[201]; //0から200まで
		long ans = 0;
		for(int i = 0 ; i < N ; i++){
			int A = sc.nextInt();
			int mod = A % 200;//200で割った余り
			ans += counter[mod];//余りを添字にして入力
			counter[mod]++;//次に同じ余りが出たら増やしたカウントを代入
		}
		System.out.println(ans);
	}
}
