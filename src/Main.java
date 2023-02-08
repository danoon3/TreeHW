import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> set = new ArrayList<>();
        set.add(new Person("Denis", "Chernikov One  ", 26));
        set.add(new Person("Irina", "Polyakova Chernikova one ", 17));
        set.add(new Person("Olga", "Zimenkova ", 30));
        set.add(new Person("Sergey", "Chernikov one two ", 14));

        Collections.sort(set, new PersonNameComparator(3));

        for (Person p : set) {
            System.out.println(p.getSurname() + " " + p.getAge());
        }

        Predicate<Person> predicate = p -> p.getAge() < 18;

        set.removeIf(predicate);
        System.out.println(set);
    }
}