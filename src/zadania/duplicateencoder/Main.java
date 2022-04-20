package zadania.duplicateencoder;

import java.util.HashMap;
import java.util.Map;

public class Main {
	static String encode(String word) {
		Map<Character, Integer> map = new HashMap<>();
		word.toLowerCase();
		for (char el : word.toCharArray()) {
			map.put(el, (map.containsKey(el)) ? map.get(el) + 1 : 1);
		}
		String value = "";
		for (char el : word.toCharArray()) {
			int var = map.get(el);
			if(var > 1) {
				value = value + "("; 
			}else {
				value = value + ")";
			}
		}

		return value;
	}

	public static void main(String[] args) {
		System.out.println(encode("Prespecialized"));

	}

}
