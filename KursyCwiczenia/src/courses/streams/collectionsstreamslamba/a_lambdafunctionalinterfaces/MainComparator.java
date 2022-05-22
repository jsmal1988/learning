package courses.streams.collectionsstreamslamba.a_lambdafunctionalinterfaces;



import java.util.function.Function;

public class MainComparator {

    public static void main(String... args) {
        
        ComparatorResolve<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge() ;
        ComparatorResolve<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()) ;
        ComparatorResolve<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()) ;
        
        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getLastName();
        Function<Person, String> f3 = p -> p.getFirstName();

        ComparatorResolve<Person> cmpPersonAge = ComparatorResolve.comparing(Person::getAge);
        ComparatorResolve<Person> cmpPersonLastName = ComparatorResolve.comparing(Person::getLastName);
        
        
        ComparatorResolve<Person> cmp = ComparatorResolve.comparing(Person::getLastName)
                                           .thenComparing(Person::getFirstName)
                                           .thenComparing(Person::getAge);
    }
}
