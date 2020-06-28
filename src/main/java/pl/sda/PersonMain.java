package pl.sda;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        PersonDatabase personDatabase = new PersonDatabase();
        List<Person> initialData = personDatabase.retrieve();

        for (Person initialDatum : initialData) {
            System.out.println(initialDatum);
        }

    }
}
