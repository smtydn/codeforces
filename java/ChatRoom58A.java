import java.util.Scanner;

public class ChatRoom58A {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] hello = {'h', 'e', 'l', 'l', 'o'};
	
		int idx = 0;
		String word = reader.nextLine();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == hello[idx]) {
				idx++;
			}
			if (idx == hello.length) {
				break;
			}
		}

		if (idx == hello.length) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		reader.close();
	}
	
}
