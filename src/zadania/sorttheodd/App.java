package zadania.sorttheodd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static int[] sortArray(int[] array) {
		List<Integer> odd = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				odd.add(array[i]);
				
			}
		}
		int index = 0;
		Collections.sort(odd);
		if (odd.size() > 0) {
			for (int i = 0; i < array.length; i++) {

				if (array[i] %2 == 1) {

					array[i] = odd.get(index);
					index++;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {
		System.out.println(sortArray(new int[] { 5, 3, 2, 8, 1, 4 }));

	}

}
