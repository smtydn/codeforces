import java.util.Scanner;

public class StonesOnTheTable266A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStones = Integer.valueOf(scanner.nextLine());
        String stones = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < numberOfStones - 1; i++) {
            if (stones.charAt(i) == stones.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}