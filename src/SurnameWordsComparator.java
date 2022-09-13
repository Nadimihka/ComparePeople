import java.util.Comparator;

public class SurnameWordsComparator implements Comparator<Person> {
    private int maxNumbWords;

    public SurnameWordsComparator(int maxNumbWords) {
        this.maxNumbWords = maxNumbWords;
    }

    /*Задача 1
    @Override
    public int compare(Person o1, Person o2) {
        int l1 = o1.getSurname().split("[ \\-]").length;
        int l2 = o2.getSurname().split("[ \\-]").length;

        if (l1 == l2) {
            return o1.getAge() > o2.getAge() ? -1 : 1;
        } else {
            return l1 > l2 ? -1 : 1;
        }
    }*/

    // Задача2
    @Override
    public int compare(Person o1, Person o2) {
        int l1 = o1.getSurname().split("[ \\-]").length;
        if (l1 > maxNumbWords) {
            l1 = 1;
        }
        int l2 = o2.getSurname().split("[ \\-]").length;
        if (l2 > maxNumbWords) {
            l2 = 1;
        }
        if (l1 == l2) {
            return o1.getAge() > o2.getAge() ? -1 : 1;
        } else {
            return l1 > l2 ? -1 : 1;
        }
    }
}
