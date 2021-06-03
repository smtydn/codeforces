import java.util.Scanner;

public class SoldierAndBananas546A {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int bananaCost = Integer.valueOf(inputs[0]);
        int dollars = Integer.valueOf(inputs[1]);
        int bananaCount = Integer.valueOf(inputs[2]);

        for (int i = 0; i <= bananaCount; i++) {
            dollars -= bananaCost * i;
        }

        if (dollars < 0) {
            System.out.println(-dollars);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
