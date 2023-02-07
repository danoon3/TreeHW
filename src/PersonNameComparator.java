import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    private int countOfSurnameWords;

    public PersonNameComparator(int countOfSurnameWords) {
        this.countOfSurnameWords = countOfSurnameWords;
    }

    @Override
    public int compare(Person p1, Person p2) {
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
    }
}

