package wzorceprojektowe.structural.builder;

import wzorceprojektowe.structural.builder.LunchOrder.Builder;

public class Demo {

	public static void main(String[] args) {
		System.out.println("=====================LunchOrderBean=====================");
		LunchOrderBean lob = new LunchOrderBean();
		lob.setBread("Wheat");
		lob.setDressing("Mustard");
		lob.setSpices("Lettuce");
		lob.setMeat("Ham");
		
		System.out.println("=====================LunchOrderBuilder=====================");
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").dressing("Mayo").spices("Tomato").meat("Turkey");
		LunchOrder lo = builder.build();
		System.out.println(lo.getBread());
		System.out.println(lo.getDressing());
		System.out.println(lo.getSpices());
		System.out.println(lo.getMeat());
		
		
	}
}
