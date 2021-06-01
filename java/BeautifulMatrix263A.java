import java.util.Scanner;
import java.util.Arrays;


public class BeautifulMatrix263A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowIndex = 0;
        int columnIndex = 0;

        for (int i = 0; i < 5; i++) {
            String[] row = scanner.nextLine().split(" ");
            if (Arrays.stream(row).anyMatch("1"::equals)) {
                rowIndex = i;
                columnIndex = Arrays.asList(row).indexOf("1");
            }
        }

        System.out.println(Math.abs(2 - rowIndex) + Math.abs(2 - columnIndex));

        scanner.close();
    }
}
