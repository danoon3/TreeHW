import java.util.*;

public class Main {
    private static int countOfSurnameWords;

    public static void main(String[] args) {
        List<Person> set = new ArrayList<>();
        set.add(new Person("Denis", "Chernikov One  ", 26));
        set.add(new Person("Irina", "Polyakova Chernikova one ", 25));
        set.add(new Person("Olga", "Zimenkova ", 39));
        set.add(new Person("Sergey", "Chernikov one two ", 40));

        countOfSurnameWords = 3;

        Comparator<Person> comparator = (p1, p2) -> {
            int firstSurname = p1.getSurname().split("(?U)\\W").length;
            int secondSurname = p2.getSurname().split("(?U)\\W").length;
            if (firstSurname > countOfSurnameWords && secondSurname > countOfSurnameWords) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
            if (firstSurname > secondSurname) {
                return 1;
            } else if (firstSurname < secondSurname) {
                return -1;
            } else {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        Collections.sort(set, comparator);

        for (Person p : set) {
            System.out.println(p.getSurname() + " " + p.getAge());
        }


    }
}