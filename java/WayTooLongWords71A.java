import java.util.Scanner;


public class WayTooLongWords71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputSize = Integer.valueOf(scanner.nextLine());
        String[] outputs = new String[inputSize];

        for (int i = 0; i < inputSize; i++) {
            String input = scanner.nextLine();
            if (input.length() > 10) {
                int inBetweenLength = input.length() - 2;
                outputs[i] = input.charAt(0) + String.valueOf(inBetweenLength) + input.charAt(input.length() - 1);
            } else {
                outputs[i] = input;
            }
        }

        for (String output : outputs) {
            System.out.println(output);
        }

        scanner.close();
    }
}
