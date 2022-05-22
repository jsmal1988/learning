package courses.streams.collectionsstreamslamba.b_functionalinterfaces;

@FunctionalInterface
public interface MyPredicate<T> {
	public boolean test(T t);

	public default MyPredicate<T> and(MyPredicate<T> other){
		
		return word -> test(word) && other.test(word);
		
	}

	public default MyPredicate<T> or(MyPredicate<T> other){
		return word -> test(word) || other.test(word);
	}

	public static <U> MyPredicate<U> isEqualTo(U other) {
		
		return word -> word.equals(other);
	}


}
