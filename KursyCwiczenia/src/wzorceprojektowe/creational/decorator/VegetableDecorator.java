package wzorceprojektowe.creational.decorator;

public class VegetableDecorator extends SandwichDecorator {

	public VegetableDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addDressing();
	}
	
	private String addDressing() {
		return " + tomato";
	}
}
