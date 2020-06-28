package pl.sda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class PersonDatabase {
    public List<Person> retrieve() {
        try {
            String s = Files.readString(Path.of("db.txt"));
            //konwertowanie pliku na liste osob itd.
        } catch (IOException e) {
            System.out.println("Nie udało mi się odczytać pliku! Zwracam pusta liste osob");
            return Collections.emptyList();
        }
        return List.of(new Person());//tutaj powinny byc zwacane osoby z pliku
    }
}
