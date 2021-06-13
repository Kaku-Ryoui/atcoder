import java.util.*;

/* 問題文javac -encoding utf-8 Main.java  */

class abc194_b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            arr2[i]=sc.nextInt();
        }
        int ans=1000000;
        for (int i=0;i<n;i++){
           for (int j=0;j<n;j++){
               if (i==j){
                   ans=Math.min(ans,arr1[i]+arr2[j]);
               }else {
                   ans=Math.min(ans,Math.max(arr1[i],arr2[j]));
               }
           }
        }
        System.out.println(ans);
    }
}
