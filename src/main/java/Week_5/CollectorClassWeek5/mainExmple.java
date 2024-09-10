package Week_5.CollectorClassWeek5;

import java.util.*;
import java.util.stream.Collectors;

public class mainExmple
{

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 28, "USA"),
                new Person("Bob", 35, "UK"),
                new Person("Charlie", 22, "USA"),
                new Person("David", 42, "Canada"),
                new Person("Eve", 30, "UK")
        );

        // 1. toList()
        // Collects stream elements into a List
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("[toList()]Names: " + names);

        // 2. toSet()
        // Collects stream elements into a Set, removing duplicates
        Set<String> countries = people.stream()
                .map(Person::getCountry)
                .collect(Collectors.toSet());
        System.out.println("[toSet()]Countries: " + countries);

        // 3. toCollection()
        // Collects stream elements into a specific collection type
        LinkedList<Person> linkedListPeople = people.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println("[toCollection()]LinkedList of people: " + linkedListPeople);

        // 4. joining()
        // Concatenates the stream elements into a single String
        String nameString = people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));
        System.out.println("[joining()]Names joined: " + nameString);

        // 5. counting()
        // Counts the number of elements in the stream
        long count = people.stream()
                .collect(Collectors.counting());
        System.out.println("[counting()]Number of people: " + count);

        // 6. summarizingInt()
        // Produces a summary of integer statistics (count, sum, min, max, average)
        IntSummaryStatistics ageSummary = people.stream()
                .collect(Collectors.summarizingInt(Person::getAge));
        System.out.println("[summarizingInt()]Age summary: " + ageSummary);

        // 7. averagingInt()
        // Calculates the average of integers
        double averageAge = people.stream()
                .collect(Collectors.averagingInt(Person::getAge));
        System.out.println("[averageInt()]Average age: " + averageAge);

        // 8. summingInt()
        // Calculates the sum of integers
        int totalAge = people.stream()
                .collect(Collectors.summingInt(Person::getAge));
        System.out.println("[summingInt()]Total age: " + totalAge);

        // 9. maxBy()
        // Finds the maximum element based on a comparator
        Optional<Person> oldestPerson = people.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Person::getAge)));
        System.out.println("[maxBy()]Oldest person: " + oldestPerson.orElse(null));

        // 10. minBy()
        // Finds the minimum element based on a comparator
        Optional<Person> youngestPerson = people.stream()
                .collect(Collectors.minBy(Comparator.comparingInt(Person::getAge)));
        System.out.println("[minBy()]Youngest person: " + youngestPerson.orElse(null));

        // 11. groupingBy()
        // Groups elements by a classification function
        Map<String, List<Person>> peopleByCountry = people.stream()
                .collect(Collectors.groupingBy(Person::getCountry));
        System.out.println("[groupingBy()]People grouped by country: " + peopleByCountry);

        // 12. partitioningBy()
        // Partitions elements based on a predicate
        Map<Boolean, List<Person>> peopleAbove30 = people.stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() > 30));
        System.out.println("[partitioningBy()]People partitioned by age > 30: " + peopleAbove30);

        // 13. toMap()
        // Collects elements into a Map
        Map<String, Integer> nameToAgeMap = people.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println("[toMap()]Name to Age Map: " + nameToAgeMap);

        // 14. collectingAndThen()
        // Performs an additional transformation on the result
        int maxAge = people.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(Person::getAge)),
                        optionalPerson -> optionalPerson.map(Person::getAge).orElse(0)
                ));
        System.out.println("[collectingAndThen()]Max age: " + maxAge);

        // 15. mapping()
        // Adapts a collector to operate on the mapped values
        Map<String, Set<String>> countryToNamesMap = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCountry,
                        Collectors.mapping(Person::getName, Collectors.toSet())
                ));
        System.out.println("[mapping()]Country to Names Map: " + countryToNamesMap);
    }
}


