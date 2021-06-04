import java.util.Scanner;


public class QueueAtTheSchool110A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split(" ");
        int queueSize = Integer.valueOf(firstLine[0]);
        int steps = Integer.valueOf(firstLine[1]);

        char[] queue = scanner.nextLine().toCharArray();
        for (int i = 0; i < steps; i++) {
            int idx = 0;
            while (idx < queueSize - 1) {
                if (queue[idx] == 'B' && queue[idx + 1] == 'G') {
                    char temp = queue[idx];
                    queue[idx] = queue[idx + 1];
                    queue[idx + 1] = temp;
                    idx++;
                }
                idx++;
            }
        }

        String result = new String(queue);
        System.out.println(result);

        scanner.close();
    }
}
