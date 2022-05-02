package wzorceprojektowe.structural.builder;

public class LunchOrder {
	public static class Builder {
		private String bread;
		private String spices;
		private String dressing;
		private String meat;
		
		public LunchOrder build() {
			return new LunchOrder(this);
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder spices(String spices) {
			this.spices = spices;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}

	private final String bread;
	private final String spices;
	private final String dressing;
	private final String meat;

	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.dressing = builder.dressing;
		this.spices = builder.spices;
		this.meat = builder.meat;
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
