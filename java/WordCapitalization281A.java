import java.util.Scanner;
import java.lang.StringBuilder;


public class WordCapitalization281A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder builder = new StringBuilder(scanner.nextLine());

        if ((int) builder.charAt(0) >= 97) {
            builder.setCharAt(0, (char) ((int) builder.charAt(0) - 32));
        }

        System.out.println(builder);

        scanner.close();
    }
}
