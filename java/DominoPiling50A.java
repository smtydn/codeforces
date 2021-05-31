import java.util.Scanner;


public class DominoPiling50A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] sizes = scanner.nextLine().split(" ");
        int m = Integer.valueOf(sizes[0]);
        int n = Integer.valueOf(sizes[1]);

        int ans = m * n / 2;
        System.out.println(ans);

        scanner.close();
    }
}
