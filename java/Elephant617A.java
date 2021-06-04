import java.util.Scanner;


public class Elephant617A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.valueOf(scanner.nextLine());

        if (target % 5 == 0) {
            System.out.println(target / 5);
        } else {
            System.out.println(target / 5 + 1);
        }

        scanner.close();
    }
}