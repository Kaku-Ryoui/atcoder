import java.util.*;
public class abc160_c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
    //格納
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

    // 最大値
		int max = k - a[n-1] + a[0];

    // 比較
		for(int i = 1; i < n; i++){
			max = Math.max(max, a[i] - a[i-1]);
		}
		System.out.println(k-max);
	}
}
