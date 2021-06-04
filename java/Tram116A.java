import java.util.Scanner;


public class Tram116A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stopCount = Integer.valueOf(scanner.nextLine());

        int maxCapacity = 0;
        int capacity = 0;
        for (int i = 0; i < stopCount; i++) {
            String[] inputs = scanner.nextLine().split(" ");
            capacity -= Integer.valueOf(inputs[0]);
            capacity += Integer.valueOf(inputs[1]);
            maxCapacity = Math.max(capacity, maxCapacity);
        }
        
        System.out.println(maxCapacity);

        scanner.close();
    }
}
