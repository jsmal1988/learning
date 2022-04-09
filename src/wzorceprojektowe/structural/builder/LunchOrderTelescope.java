package wzorceprojektowe.structural.builder;

public class LunchOrderTelescope {
	private String bread;
	private String spices;
	private String dressing;
	private String meat;

	public LunchOrderTelescope(String bread) {
		this.bread = bread;
	}
	public LunchOrderTelescope(String bread, String spices, String dressing) {
		this(bread);
		this.spices = spices;
		this.dressing = dressing;
	}
	public LunchOrderTelescope(String bread, String spices, String dressing, String meat) {
		this(bread, spices, meat);
		this.meat = meat;
	}
	
	
	public String getBread() {
		return bread;
	}

	public String getSpices() {
		return spices;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}

}
