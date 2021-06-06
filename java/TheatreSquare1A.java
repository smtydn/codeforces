import java.util.Scanner;

public class TheatreSquare1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split(" ");
        long n = Long.valueOf(inputs[0]);
        long m = Long.valueOf(inputs[1]);
        long a = Long.valueOf(inputs[2]);

        long row = n / a;
        if (n % a != 0) {
            row++;
        }

        long column = m / a;
        if (m % a != 0) {
            column++;
        }

        System.out.println(row * column);

        scanner.close();
    }
}