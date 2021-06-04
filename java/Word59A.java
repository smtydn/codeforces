import java.util.Scanner;


public class Word59A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if ((int) c < 97) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }

        if (uppercaseCount > lowercaseCount) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
