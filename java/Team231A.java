import java.util.Scanner;


public class Team231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int problemCount = Integer.valueOf(scanner.nextLine());
        int submissionCount = 0;

        for (int i = 0; i < problemCount; i++) {
            String input = scanner.nextLine();
            int decisionTotal = 0;
            
            for (String part : input.split(" ")) {
                int value = Integer.valueOf(part);
                decisionTotal += value;
            }
            
            if (decisionTotal > 1) {
                submissionCount++;
            }
        }

        System.out.println(submissionCount);

        scanner.close();
    }
}
