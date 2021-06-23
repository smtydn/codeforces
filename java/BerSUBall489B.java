import java.util.Scanner;
import java.util.Arrays;

public class BerSUBall489B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.valueOf(scanner.nextLine());
		int[] boys = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();
		Arrays.sort(boys);
		int m = Integer.valueOf(scanner.nextLine());
		int[] girls = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();
		Arrays.sort(girls);

		int p1 = 0;
		int p2 = 0;
		int res = 0;

		while ((p1 < n) && (p2 < m)) {
			if (Math.abs(boys[p1] - girls[p2]) <= 1) {
				res++;
				p1++;
				p2++;
			} else {
				if (boys[p1] < girls[p2]) {
					p1++;
				} else {
					p2++;
				}
			}
		}
		
		System.out.println(res);

		scanner.close();
	}
	
}
