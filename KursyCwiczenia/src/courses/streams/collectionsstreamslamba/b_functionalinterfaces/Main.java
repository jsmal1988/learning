package courses.streams.collectionsstreamslamba.b_functionalinterfaces;

public class Main {

	public static void main(String[] args) {
		MyPredicate<String> p1 = s -> s.length() < 20;
		MyPredicate<String> p2 = s -> s.length() > 5;
		
		
		System.out.println("p1 test:" + p1.test("dupa"));
		System.out.println("p1 test:" + p1.test("dupadupa1231231231312321"));

		MyPredicate<String> p3 = p1.and(p2);
		System.out.println("p3 test:" + p3.test("yes"));
		System.out.println("p3 test:" + p3.test("33344443"));
		System.out.println("p3 test:" + p3.test("dupadupa1231231231312321"));
		
		
		MyPredicate<String> p4 = p1.or(p2);
		System.out.println("p4 test:" + p4.test("yes"));
		System.out.println("p4 test:" + p4.test("33344443"));
		System.out.println("p4 test:" + p4.test("dupadupa1231231231312321"));
		
		
		MyPredicate<String> p5 = MyPredicate.isEqualTo("yes");
		System.out.println("p5 test:" + p5.test("yes"));
		System.out.println("p5 test:" + p5.test("no"));
	}	

}
