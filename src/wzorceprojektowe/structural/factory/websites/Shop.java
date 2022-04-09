package wzorceprojektowe.structural.factory.websites;
import wzorceprojektowe.structural.factory.pages.CartPage;
import wzorceprojektowe.structural.factory.pages.ItemPage;
import wzorceprojektowe.structural.factory.pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
