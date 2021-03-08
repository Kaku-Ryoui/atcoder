import java.util.*;

/* スペース区切りの2つの整数がn行与えられるので、2つの整数をそれぞれ足し合わせて、さらに、その結果をすべての行について足し合わせて出力してください。
ただし、2つの整数が同じだった場合は、2つの整数を掛け合わせてから、その結果を足し合わせてください。 */

class total_value_9{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0;i < n;i++) {
      long a[] = new long[2];
      a[0] = sc.nextInt();
      a[1] = sc.nextInt();
      if(a[0] != a[1]){
        ans += a[0]+a[1];
      }else{
        ans += a[0]*a[1];
      }
    }
    System.out.println(ans);
  }
}
