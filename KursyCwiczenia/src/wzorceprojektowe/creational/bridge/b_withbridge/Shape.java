package wzorceprojektowe.creational.bridge.b_withbridge;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
