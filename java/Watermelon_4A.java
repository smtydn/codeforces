import java.util.Scanner;


public class Watermelon_4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight = Integer.valueOf(scanner.nextLine());

        if (weight % 2 == 0 && weight > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}