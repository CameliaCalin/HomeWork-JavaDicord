package src.Teme;
/*-Given a list of Person objects with age and city attributes, filter out people younger than 18 or those who live in the city "Metropolis", then return a list of names of the remaining people, sorted in reverse order.
-Using https://www.w3schools.com/sql/sql_insert.asp, write sql scripts to insert/select/update/delete elements from a table with name Product and fields: name, price, tva. (1 script for every command: insert/select/update/delete)*/

/*import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ana", 25, "Metropolis"));
        people.add(new Person("Bianca", 17, "Gotham"));
        people.add(new Person("Cami", 20, "Metropolis"));
        people.add(new Person("David", 19, "Star City"));
        people.add(new Person("Emma", 22, "Smallville"));

        List<String> remainingNamesSorted = people.stream()
            .filter(person -> person.getAge() >= 18 && !person.getCity().equals("Metropolis"))
            .map(Person::getName)
            .sorted((a, b) -> b.compareTo(a)) // Sort in reverse order
            .collect(Collectors.toList());

        System.out.println(remainingNamesSorted);
    }
}
*/


/*INSERT INTO Product (name, price, tva)
VALUES ('Product1', 100, 0.2),
       ('Product2', 200, 0.18),
       ('Product3', 150, 0.15);*/

/*UPDATE Product
SET price = 120, tva = 0.19
WHERE name = 'Product1';
*/

/*DELETE FROM Product
WHERE name = 'Product3';
*/

/*CREATE TABLE Product (
    name VARCHAR(255),
    price DECIMAL(10, 2),
    tva DECIMAL(3, 2)
);
*/