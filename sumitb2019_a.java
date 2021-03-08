import java.util.*;

/* 問題文
2019 年 11 月 30 日のような、ある月の最後の日を「月末日」といいます。
整数 M 1 , D 1 , M 2 , D 2 が入力されます。
2019 年 M 1 月 D 1 日の次の日が 2019 年 M 2 月 D 2 日であることが分かっています。
2019 年 M 1 月 D 1 日が月末日であるか判定してください。
制約
2019 年 M 1 月 D 1 日、 2019 年 M 2 月 D 2 日はともにグレゴリオ暦において存在する日付である。
2019 年 M 1 月 D 1 日の次の日は 2019 年 M 2 月 D 2 日である。
 */

class sumitb2019_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int M1 = sc.nextInt();
    int D1 = sc.nextInt();
    int M2 = sc.nextInt();
    int D2 = sc.nextInt();
    if(D1 == 28 || D1 == 29 || D1 == 30 || D1 == 31){
      System.out.println(D2 == 1 ? 1:0);
    }else{
      System.out.println(0);
    }
  }
}
