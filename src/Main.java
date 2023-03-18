import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Person> personStream = Stream.of(new Person(20),
                new Person(25),
                new Person(27),
        new Person(45));
        BiConsumer<Person, Person> personBiConsumer = (min, max) -> System.out.println(min.toString() + max.toString());
        Comparator<Person> personComparator = Comparator.comparing(Person::getAge);
        findMinMax(personStream,personComparator, personBiConsumer);
findCountEvenNums(List.of(122,33,22,24,2,4,132));




    }
    public static <T> void findMinMax (
            Stream< ? extends T > stream,
            Comparator< ? super T > order,
            BiConsumer< ? super T, ?super T > minMaxConsumer){
        List<T> list = stream.collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            list.sort(order);
            minMaxConsumer.accept(list.get(0), list.get(list.size() -1));
        }
    }
    public static void findCountEvenNums(List<Integer> list) {

       int number = (int) (list.stream().filter(v -> v % 2 == 0)).count();
        System.out.println("четные числа: "  + number);
    }
}