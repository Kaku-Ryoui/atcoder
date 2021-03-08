import java.util.*;

 // 整数 N を K 進数で表したとき、何桁になるかを求めてください。
 // 注記 K 進表記については、Wikipedia「位取り記数法」を参照してください。
 // 制約 入力は全て整数である。 1 ≤ N ≤ 10 9 2 ≤ K ≤ 10

class Abc156_b{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(Integer.toString(sc.nextInt(),sc.nextInt()).length());
    }
}
