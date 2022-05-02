package wzorceprojektowe.structural.factory.websites;
import wzorceprojektowe.structural.factory.pages.AboutPage;
import wzorceprojektowe.structural.factory.pages.CommentPage;
import wzorceprojektowe.structural.factory.pages.ContactPage;
import wzorceprojektowe.structural.factory.pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
