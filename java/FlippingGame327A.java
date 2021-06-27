import java.util.Scanner;
import java.util.Arrays;

public class FlippingGame327A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.valueOf(scanner.nextLine());
		int[] a = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::valueOf)
			.toArray();
		int sumOfA = 0;
		for (int i = 0; i < n; i++) {
			sumOfA += a[i];
		}

		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i++) {
			dp[i][i] = sumOfA;
			if (a[i] == 1) {
				dp[i][i]--;
			} else {
				dp[i][i]++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				dp[i][j] = dp[i][j - 1];
				if (a[j] == 1) {
					dp[i][j]--;
				} else {
					dp[i][j]++;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				max = Math.max(max, dp[i][j]);
			}
		}

		System.out.println(max);

		scanner.close();
	}

}