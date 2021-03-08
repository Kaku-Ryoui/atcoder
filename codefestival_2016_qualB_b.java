import java.util.*;

/* 問題文問題文
CODE FESTIVAL 2016の予選には N 人が参加しました。
参加者は、国内の学生であるか、海外の学生であるか、どちらでもないかのどれかです。
予選は国内または海外の学生のみが通過することができ、上位の学生から順に、以下の条件を満たすときに通過します。学生でない参加者は予選を通過できません。
  ・国内の学生は、現在予選の通過が確定した参加者が A + B 人に満たなければ、
    予選を通過する
  ・海外の学生は、現在予選の通過が確定した参加者が A + B 人に満たず、
    さらに海外の学生の中での順位が B 位以内なら、予選を通過する
参加者の情報を表す文字列 S が与えられます。 S の i 文字目がaのとき予選で i 位の参加者が国内の学生であることを、 S の i 文字目がbのとき予選で i 位の参加者が海外の学生であることを、 S の i 文字目がcのとき予選で i 位の参加者がそのどちらでもないことを表しています。 すべての参加者について、上位から順に、予選を通過した場合はYes、そうでない場合はNoを出力するプログラムを作成してください。
制約
1 ≦ N , A , B ≦ 100000 A + B ≦ N
S の長さは N である。
S は文字aとbとcのみからなる。
  */

class codefestival_2016_qualB_b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    String S = sc.next();
    int C = 0;
    int b =0;
    for(int i = 0; i < N; i++){
      //国内の学生
      if(S.charAt(i) == 'a'){
        //海外の学生が通過しない可能性の条件分岐
        if(B >= b){
          System.out.println(A+B+C > i? "Yes" : "No");
        }else if(B < b){
          System.out.println(A+B+C+(b-B)> i ? "Yes" : "No");
        }
      //海外の学生
      }else if(S.charAt(i) == 'b'){
        //海外学生だけの人数
        b++;
        System.out.println(A+B+C > i && B >= b ? "Yes" : "No");
      // どちらでもない
      }else{
        C++;
        System.out.println("No");
      }
    }
  }
}
