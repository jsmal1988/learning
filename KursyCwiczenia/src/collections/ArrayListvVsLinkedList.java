package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListvVsLinkedList {

	public static void main(String[] args) {
		LinkedList<String> namesLinkedList = new LinkedList<>();
		namesLinkedList.add("John");
		namesLinkedList.add("Adam");
		namesLinkedList.add("Bruno");
		namesLinkedList.add("George");
		System.out.println(namesLinkedList.get(2));

		ArrayList<String> namesArrayList = new ArrayList<>();
		namesArrayList.add("John");
		namesArrayList.add("Adam");
		namesArrayList.add("Bruno");
		namesArrayList.add("George");
		System.out.println(namesArrayList.get(2));
		
	}

}
