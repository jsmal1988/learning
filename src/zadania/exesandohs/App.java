package zadania.exesandohs;

public class App {
	public static boolean getXO(String str) {
		int count = 0;
		for (Character c : str.toLowerCase().toCharArray()) {

			if (c.equals('x')) {
				count++;
			} else if (c.equals('o')) {
				count--;
			}

		}
		return count == 0 ? true : false;

	}

	public static void main(String[] args) {
		System.out.println(getXO("xxx23424esdsfvxXXOOooo"));

	}

}
