package zadania.breakcamelcase;

public class App {
	static String camelCase(String s) {
		String[] stringArray = s.split("(?=\\p{Lu})");
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<= stringArray.length; i++) {
			
			sb.append(stringArray[i-1]);
			if(i < stringArray.length) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(camelCase("camelCasing"));

	}

}
