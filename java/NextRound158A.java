import java.util.Scanner;


public class NextRound158A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] conditions = scanner.nextLine().split(" ");
        int n = Integer.valueOf(conditions[0]);
        int k = Integer.valueOf(conditions[1]);

        String[] scoresInput = scanner.nextLine().split(" ");
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.valueOf(scoresInput[i]);
        }
        int treshold = scores[k - 1];

        int advanceCount = 0;
        for (int score : scores) {
            if (score > 0 && score >= treshold) {
                advanceCount++;
            } else {
                break;
            }
        }

        System.out.println(advanceCount);

        scanner.close();
    }
}
