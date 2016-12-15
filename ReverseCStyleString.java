import java.util.Scanner;

public class ReverseCStyleString {
	// C Style String is like "abcd" containing 5 characters including null
	// character.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(getReverseOfCstyleString(s));

	}

	public static String getReverseOfCstyleString(String s) {
		char[] data = s.toCharArray();
		int i = 0;
		int j = data.length - 1;
		System.out.println("j---------" + j);
		char temp;
		while (i < j) {
			temp = data[i];
			data[i] = data[j];
			data[j] = temp;
			i++;
			j--;

		}

		return new String(data);
	}
}
