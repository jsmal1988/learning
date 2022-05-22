package courses.streams.collectionsstreamslamba.c_lambdascollectionsframeworkd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
	public static void main(String args[]) {
		Person p1 = new Person("Alice", 23);
        Person p2 = new Person("Brian", 56);
        Person p3 = new Person("Chelsea", 46);
        Person p4 = new Person("David", 28);
        Person p5 = new Person("Erica", 37);
        Person p6 = new Person("Francisco", 18);
        List<Person> people = new ArrayList(Arrays.asList(p1, p2,p3,p4,p5,p6));
        people.forEach(System.out::println);
        people.removeIf(person -> person.getAge() < 30);
        System.out.println("AfterReplaceAll");
        people.replaceAll(person -> new Person(person.getName().toUpperCase(), person.getAge()));
        System.out.println("AfterRemove");
        people.sort(Comparator.comparing(Person::getAge).reversed());
        people.forEach(System.out::println);
        
        
       
	}
}
