package courses.streams.collectionsstreamslamba.a_lambdafunctionalinterfaces;

import java.util.function.Function;

@FunctionalInterface
public interface ComparatorResolve<T> {

    public int compare(T t1, T t2);
    
    public default ComparatorResolve<T> thenComparing(ComparatorResolve<T> cmp) {
        
        return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2) : compare(p1, p2) ;
    }
    
    public default ComparatorResolve<T> thenComparing(Function<T, Comparable> f) {
        
        return thenComparing(comparing(f)) ;
    }
    
    public static <U> ComparatorResolve<U> comparing(Function<U, Comparable> f) {
        
        return (p1, p2) ->  f.apply(p1).compareTo(f.apply(p2));
    }
}
