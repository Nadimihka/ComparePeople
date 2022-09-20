import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Ипполитов-Иванов", 57));
        people.add(new Person("Петр", "Петров-Водкин Остроумов", 24));
        people.add(new Person("Александр", "Аллександров", 47));
        people.add(new Person("Сергей", "Серегин-Мценский Запашный-Веденеев", 58));
        people.add(new Person("Поль", "Мария Ремарк", 17));

        // Задача 1
        Comparator<Person> comparator;
        comparator = (a, b) -> {

            Predicate<Integer> isMore = x -> x > 3;
            int l1 = a.getSurname().split("[ \\-]").length;
            if (isMore.test(l1)) {
                l1 = 1;
            }
            int l2 = b.getSurname().split("[ \\-]").length;
            if (isMore.test(l2)) {
                l2 = 1;
            }

            if (l1 == l2) {
                return a.getAge() > b.getAge() ? -1 : 1;
            } else {
                return l1 > l2 ? -1 : 1;
            }
        }
        ;
        Collections.sort(people, comparator);
        System.out.println("Персоны в порядке убывания знатности:");
        people.forEach(System.out::println);

    }
}
