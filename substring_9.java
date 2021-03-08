import java.util.Scanner;
//スペース区切りの2つの整数と、文字列が入力されるので、2つの整数の範囲の部分文字列を出力してください。
//●入力
// a b
// s

class substring_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.nextLine(); // 読み飛ばし
        String string = scanner.nextLine();

        System.out.println(string.substring(start - 1, end));

        scanner.close();
    }
}
