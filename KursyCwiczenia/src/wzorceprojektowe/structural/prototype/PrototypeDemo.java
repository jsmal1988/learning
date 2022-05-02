package wzorceprojektowe.structural.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		
		System.out.println("=================Movie======================");
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in Java");
	
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		System.out.println("=================AnotherMovie======================");
		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
		
		System.out.println("=================AnotherAnotherMovie======================");
		Movie anotherMovie2 = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Test");
		
		System.out.println(anotherMovie2);
		System.out.println(anotherMovie2.getRuntime());
		System.out.println(anotherMovie2.getTitle());
		System.out.println(anotherMovie2.getUrl());
	}

}