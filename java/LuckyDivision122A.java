import java.util.Scanner;

public class LuckyDivision122A {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int input = Integer.valueOf(reader.nextLine());
		int[] luckyNumbers = {
			4, 7, 44, 47, 74, 77,
			444, 447, 474, 477, 744, 747, 774, 777
		};
		boolean flag = false;

		for (int luckyNumber: luckyNumbers) {
			if (luckyNumber > input) {
				break;
			}

			if (input == luckyNumber) {
				flag = true;
				break;
			}

			if (input % luckyNumber == 0) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		reader.close();
	}
	
}
