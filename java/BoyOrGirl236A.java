import java.util.Scanner;

public class BoyOrGirl236A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nickName = scanner.nextLine();
        int[] occurrences = new int[26];

        for (int i = 0; i < nickName.length(); i++) {
            int index = (int) nickName.charAt(i) - 97;
            occurrences[index] += 1;
        }

        int uniqueChars = 0;
        for (int number : occurrences) {
            if (number > 0) {
                uniqueChars++;
            }
        }

        if (uniqueChars % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        scanner.close();
    }
}
