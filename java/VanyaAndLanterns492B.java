import java.util.Scanner;
import java.util.Arrays;

public class VanyaAndLanterns492B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] firstLine = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::valueOf)
			.toArray();
		int n = Integer.valueOf(firstLine[0]);
		int l = Integer.valueOf(firstLine[1]);
	
		int[] locs = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::valueOf)
			.toArray();
		Arrays.sort(locs);

		double d = Math.max(locs[0], l - locs[n - 1]) * 1.0;
		for (int i = 1; i < n; i++) {
			double dist = 1.0 * (locs[i] - locs[i - 1]) / 2;
			d = Math.max(d, dist);
		}

		System.out.println(d);

		scanner.close();
	}

}