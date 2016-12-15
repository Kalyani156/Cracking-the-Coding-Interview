import java.util.Scanner;

public class ReplaceSpaceInPlaceGivenTrueLength {

	// %20 has 3 characters. if we replace one character by space, then we have
	// extra two space.
	// string hold extra space at the end of string to add additional characters
	public static final char SPACE = ' ';

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		replaceSpaces(s, 13);

	}

	public static void replaceSpaces(String s, int truelength) {
		char[] ch = s.toCharArray();
		int spaceCount = 0;
		for (int i = 0; i < truelength; i++) {
			if (ch[i] == SPACE) {
				spaceCount++;
			}
		}

		// %20 has 3 characters, we replace only one character by blank
		// space.remaining two characters are left
		int newLength = truelength + spaceCount * 2;
		char newChar[] = new char[newLength];
		for (int i = truelength - 1; i >= 0; i--) {

			if (ch[i] != SPACE) {
				newChar[newLength - 1] = ch[i];
				newLength = newLength - 1;
				System.out.println("ch[i] " + ch[i]);
			} else {
				newChar[newLength - 1] = '0';
				newChar[newLength - 2] = '2';
				newChar[newLength - 3] = '%';
				newLength = newLength - 3;

			}
		}
		System.out.println(String.valueOf(newChar));

	}
}
