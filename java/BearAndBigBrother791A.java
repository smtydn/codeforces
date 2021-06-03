import java.util.Scanner;

public class BearAndBigBrother791A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.valueOf(inputs[0]);
        int b = Integer.valueOf(inputs[1]);
        int years = 0;

        while (a <= b) {
            a *= 3;
            b *= 2;
            years++;
        }

        System.out.println(years);

        scanner.close();
    }
}
