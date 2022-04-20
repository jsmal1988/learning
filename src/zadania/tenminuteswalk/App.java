package zadania.tenminuteswalk;

public class App {
	public static boolean isValid(char[] walk) {
		if(walk.length == 10) {
			int northsount =0;
			int westeast =0;
			for(char c : walk) {
				switch(c) {
				case 'n': northsount++; break;
				case 's': northsount--;break;
				case 'e': westeast++;break;
				case 'w': westeast--;break;
				}
			}
			if(northsount == 0 && westeast ==0) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;	
		}
		
	}

	public static void main(String[] args) {
		System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));

	}

}
