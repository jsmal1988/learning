package wzorceprojektowe.creational.bridge.b_withbridge;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
