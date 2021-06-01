import java.util.Scanner;

public class BitPlusPlus282A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operationCount = Integer.valueOf(scanner.nextLine());
        int output = 0;

        for (int i = 0; i < operationCount; i++) {
            String operation = scanner.nextLine();

            if (operation.contains("+")) {
                output++;
            } else {
                output--;
            }
        }

        System.out.println(output);

        scanner.close();
    }
}