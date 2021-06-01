import java.util.Scanner;
import java.util.Arrays;


public class HelpfulMaths339A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\+");
        Arrays.sort(numbers);

        System.out.println(String.join("+", numbers));

        scanner.close();
    }
}
