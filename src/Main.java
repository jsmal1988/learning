
public class Main {
	public static void main(String[] args) {
		double f1 = .0;
		  for (int i = 1; i <= 11; i++) {
		    f1 += .1;
		  }
		 
		  //Method 2
		  double f2 = .1 * 11;
		 
		  System.out.println("f1 = " + f1);
		  System.out.println("f2 = " + f2);
	}
}
