import java.util.*;
/* 問題文
CODE FESTIVAL 2016が開催されます。開催にあたって、高橋君はCODE FESTIVAL 2016の看板を作ることにしました。
看板にはCODEFESTIVAL2016と書きたかったのですが、高橋君は間違えて異なる文字列S
を書いてしまいました。幸い、書いた文字列の長さは間違っていませんでした。
そこで高橋君は、ある文字を別の文字に書き換えるという操作を最小の回数行って、この文字列をCODEFESTIVAL2016に書き換えることにしました。
書き換えの回数の最小値を求めてください。*/
class codefestival_2016_qualB_a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String res = "CODEFESTIVAL2016";
    String S = sc.next();
    int cnt = 0;
    for(int i = 0; i < 16; i++){
      if(res.charAt(i) != S.charAt(i)){
        cnt++;
        }
      }
    System.out.println(cnt);
    }
  }
