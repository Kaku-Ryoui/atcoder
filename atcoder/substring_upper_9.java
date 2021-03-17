import java.util.Scanner;
// スペース区切りの2つの整数と、文字列が入力されます。2つの整数の範囲の部分文字列を、大文字にして出力してください。
// ●入力
// a b
// s
public class substring_upper_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String S = sc.nextLine();
            String str = S.substring(a-1,b);
            String STR = str.toUpperCase();
            System.out.println(S.replace(str,STR));
    }
}


// import java.util.Scanner;
// 解答
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int start = scanner.nextInt();
//         int end = scanner.nextInt();
//         scanner.nextLine();
//         String string = scanner.nextLine();
//
//         System.out.println(string.substring(0, start - 1) + string.substring(start - 1, end).toUpperCase() + string.substring(end));
//     }
// }
