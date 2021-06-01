import java.util.Scanner;


public class PetyaAndStrings112A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();

        if (first.compareTo(second) < 0) {
            // First comes first, output -1
            System.out.println(-1);
        } else if (first.compareTo(second) == 0) {
            // Strings are equal, output 0
            System.out.println(0);
        } else {
            // Second comes first, output 1
            System.out.println(1);
        }

        scanner.close();
    }
}
