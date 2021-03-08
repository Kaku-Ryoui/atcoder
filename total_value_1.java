import java.util.Scanner;

// 整数nが1行目、続く行でn個の文字列が与えられるので、n個の文字列をそのまま出力してください。

class total_value_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 行送り

        for (int i = 0; i < N; i++) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
