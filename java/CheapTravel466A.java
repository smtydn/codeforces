import java.util.Scanner;
import java.util.Arrays;

public class CheapTravel466A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] input = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();

		if (input[1] * input[2] <= input[3]) {
			System.out.println(input[0] * input[2]);
		} else {
			int result = 0;
			while (input[0] > 0) {
				if (input[0] > input[1]) {
					result += input[3];
					input[0] -= input[1];
				} else {
					if (input[0] * input[2] <= input[3]) {
						result += input[0] * input[2];
					} else {
						result += input[3];
					}
					break;
				}
			}
			System.out.println(result);
		}

		scanner.close();
	}
	
}
