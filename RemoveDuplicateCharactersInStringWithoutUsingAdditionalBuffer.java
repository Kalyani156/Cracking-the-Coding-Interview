/**
Design an algorithm and write code to remove the duplicate characters in a string
without using any additional bu#er. NOTE: One or two additional variables are fine.

Additional Buffer may be any data structure for storage like list,set or it may be any StringBuffer, StringBuilder

Algorithm-
1) Check for every character, if it is a duplicate character of already found character
2) Skip duplicate characters and update it with non duplicate characters.
**/

import java.util.Scanner;

public class RemoveDuplicateCharactersInStringWithoutUsingAdditionalBuffer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(replaceSpaceWithoutAdditionalBuffer(s));
	}

	public static String replaceSpaceWithoutAdditionalBuffer(String s) {
		char[] data = s.toCharArray();
		for (int i = 1; i < data.length; i++) {
			for (int j = 0; j < i; j++) {
				if (data[i] == data[j]) {
					data[i] = '%';
				}
			}
		}
		return new String(data).replaceAll("%", "");
	}
}
