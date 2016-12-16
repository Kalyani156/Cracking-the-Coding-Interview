/**
Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary bu#er is not allowed?

**/

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromUnsortedLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("2");
		System.out.println(removeDupFromUnsortedLinkedList(list));
	}

	public static List<String> removeDupFromUnsortedLinkedList(
			LinkedList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
		return list;
	}
}
