import java.util.*;

public class TwoSubstrings550A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> ab = new ArrayList<Integer>();
		List<Integer> ba = new ArrayList<Integer>();

		String text = scanner.nextLine();

		for (int i = 0; i < text.length() - 1; i++) {
			if (text.substring(i, i + 2).equals("AB")) {
				ab.add(i);
			} else if (text.substring(i, i + 2).equals("BA")) {
				ba.add(i);
			}
		}

		if (ab.isEmpty() || ba.isEmpty()) {
			System.out.println("NO");
		} else if ((Math.abs(maxInt(ab) - minInt(ba)) >= 2) || (Math.abs(minInt(ab) - maxInt(ba)) >= 2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		scanner.close();
	}

	public static int maxInt(List<Integer> list) {
		int max = -1;

		for (Integer n: list) {
			if (n > max) {
				max = n;
			}
		}

		return max;
	}

	public static int minInt(List<Integer> list) {
		int min = 100000;

		for (Integer n: list) {
			if (n < min) {
				min = n;
			}
		}

		return min;
	}

}