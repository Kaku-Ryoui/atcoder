import java.util.*;

/* 問題文
非負整数 L,R が与えられます。
 2 つの整数 i,j を L≤i<j≤R を満たすように選びます。
(i×j) mod 2019 の最小値を求めてください。
制約
・入力は全て整数
・0≤L<R≤2×10^9
javac -encoding utf-8 Main.java */

class abc133_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    long opt=2019;
    if(L==0||R-L>=2019){
      opt=0;
    }else{
      for(long i=L;i<R;i++){
          for(long j=i+1;j<=R;j++){
              long num = (i*j)%2019;
              if(opt>num) opt=num;
          }
        }
      }
    System.out.println(opt);
  }
}
