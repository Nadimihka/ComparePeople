import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Антон", "Антонюк", 16));
        people.add(new Person("Иван", "Ипполитов-Иванов", 57));
        people.add(new Person("Петр", "Петров-Водкин Остроумов", 24));
        people.add(new Person("Александр", "Аллександров", 47));
        people.add(new Person("Сергей", "Серегин-Мценский Запашный-Веденеев", 58));
        people.add(new Person("Поль", "Мария Ремарк", 17));

        /*Predicate<Person> age = x -> x.getAge() < 18;
        people.removeIf(age);*/
        people.removeIf(x -> x.getAge() < 18);
        System.out.println("Персоны за исключением тех, кто младше 18 лет:");
        people.forEach(System.out::println);
    }
}
