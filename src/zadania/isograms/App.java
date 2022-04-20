package zadania.isograms;

public class App {
	public static boolean  isIsogram(String str) {
		str = str.toLowerCase();
		for(char c : str.toCharArray()) {
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				
			}else {
				return false;
			}
		}
		return true;
    } 
	

	public static void main(String[] args) {
		System.out.println(isIsogram(""));
	}

}
