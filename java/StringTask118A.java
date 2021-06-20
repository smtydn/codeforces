import java.util.Scanner;
import java.lang.StringBuilder;

public class StringTask118A {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] vowels = {'a', 'o', 'y', 'e', 'u', 'i'};

		String word = reader.nextLine().toLowerCase();
		
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			if (new String(vowels).indexOf(word.charAt(i)) == -1) {
				output.append("." + word.charAt(i));
			}
		}

		System.out.println(output);

		reader.close();
	}

}