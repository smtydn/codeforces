import java.util.Scanner;

public class WrongSubtraction977A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.valueOf(inputs[0]);
        int k = Integer.valueOf(inputs[1]);

        for (int i = 0; i < k; i++) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
        }

        System.out.println(n);

        scanner.close();
    }
}
