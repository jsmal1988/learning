package wzorceprojektowe.structural.factory;

import wzorceprojektowe.structural.factory.websites.Website;
import wzorceprojektowe.structural.factory.websites.WebsiteFactory;
import wzorceprojektowe.structural.factory.websites.WebsiteType;

public class FactoryDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());
	}

}
