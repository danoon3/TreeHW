import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> set = new ArrayList<>();
        set.add(new Person("Denis", "Chernikov One  ", 26));
        set.add(new Person("Irina", "Polyakova Chernikova one ", 25));
        set.add(new Person("Olga", "Zimenkova ", 39));
        set.add(new Person("Sergey", "Chernikov one two ", 40));

        Collections.sort(set, new PersonNameComparator(3));

        for (Person p: set) {
            System.out.println(p.getSurname() + " " + p.getAge());
        }


    }
}