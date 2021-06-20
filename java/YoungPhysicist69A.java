import java.util.Scanner;

public class YoungPhysicist69A {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int forceCount = Integer.valueOf(reader.nextLine());
		int[] dimTotals = {0, 0, 0};
		for (int i = 0; i < forceCount; i++) {
			String[] dims = reader.nextLine().split(" ");
			for (int j = 0; j < 3; j++) {
				dimTotals[j] += Integer.valueOf(dims[j]);
			}
		}

		if (
			dimTotals[0] == 0 &&
			dimTotals[1] == 0 &&
			dimTotals[2] == 0
		) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		reader.close();
	}
	
}
