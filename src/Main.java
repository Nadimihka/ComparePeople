import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Ипполитов-Иванов", 57));
        people.add(new Person("Петр", "Петров-Водкин Остроумов", 24));
        people.add(new Person("Александр", "Аллександров", 47));
        people.add(new Person("Сергей", "Серегин-Мценский Запашный-Веденеев", 58));
        people.add(new Person("Поль", "Мария Ремарк", 17));

        Collections.sort(people, new SurnameWordsComparator(3));
        System.out.println("Персоны в порядке убывания знатности:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
