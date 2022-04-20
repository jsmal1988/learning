package zadania.convertstringtocamelcase;

public class App {
	static String toCamelCase(String s){
		StringBuilder sb = new StringBuilder();

		boolean flag = false;
		for(Character ch : s.toCharArray()) {
			if(ch.equals('_') || ch.equals('-')) {
				flag = true;
			}else if(flag) {
				sb.append(Character.toUpperCase(ch));
				flag=false;
			}else {
				sb.append(ch);
			}
		}
		String ss = sb.toString();
	    return ss;
	  }

	public static void main(String[] args) {
		System.out.println(toCamelCase("the_Stealth_Warrior"));

	}

}
