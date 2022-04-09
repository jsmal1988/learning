package wzorceprojektowe.creational.decorator;

public class DecoratorSandwichDemo {

	public static void main(String args[]) {
		Sandwich sandwich = new DressingDecorator(new VegetableDecorator(new MeatDecorator(new SimpleSandwich())));
		
		System.out.println(sandwich.make());
	}
}
