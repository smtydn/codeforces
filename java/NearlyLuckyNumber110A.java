import java.util.Scanner;


public class NearlyLuckyNumber110A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] digits = scanner.nextLine().toCharArray();
        scanner.close();

        int luckyDigitCount = 0;
        for (char c : digits) {
            if (c == '4' || c == '7') {
                luckyDigitCount++;
            }
        }

        if (luckyDigitCount == 4 || luckyDigitCount == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
