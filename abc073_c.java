import java.util.*;

/* 問題文javac -encoding utf-8 Main.java */

class abc073_c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Set<Integer> m = new HashSet<>();
    for(int i = sc.nextInt(); i > 0; i--){
      int t = sc.nextInt();
      if(!m.remove(t))m.add(t);
    }
    System.out.println(m.size());
  }
}
