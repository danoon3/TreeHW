import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    private int countOfSurnameWords;

    public PersonNameComparator(int countOfSurnameWords) {
        this.countOfSurnameWords = countOfSurnameWords;
    }

    @Override
    public int compare(Person p1, Person p2) {
        String firstSurname = p1.getSurname();
        String secondSurname = p2.getSurname();

        String[] firstWords = firstSurname.split("\\P{IsAlphabetic}+");
        String[] secondWords = secondSurname.split("\\P{IsAlphabetic}+");

        if (firstWords.length <= countOfSurnameWords && secondWords.length <= countOfSurnameWords) {

            if (firstWords.length > secondWords.length) {
                return 1;
            } else if (firstWords.length < secondWords.length) {
                return -1;
            } else {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        } else {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }
}
