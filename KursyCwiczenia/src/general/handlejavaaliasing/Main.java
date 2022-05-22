package general.handlejavaaliasing;

class A {
	public void methodParent() {
		System.out.println("method in Parent");
	}
}
 
class B extends A {
	public void methodParent() {
		System.out.println("override method in Child");
	}
 
	public void methodChild() {
		System.out.println("method in Child");
	}
}
//The reason is that Java handles aliasing during run-time. 
//During run-time, it knows that element should be a B object, instead of A.
public class Main {
 
	public static void main(String[] args) {
 
		B[] b = new B[10];
		A[] a = b;
 
		a[0] =  new B();
		a[1] = new A();
		b[0].methodParent();
	}
}