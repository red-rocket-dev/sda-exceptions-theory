package pl.sda;

import pl.sda.exception.MyException;
import pl.sda.exception.MyThrowable;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //TODO: Obsługa poszczególnych typów wyjątków OK
        //TODO: Obsługa wyjątków rzucanych przez funkcje Javy OK
        //TODO: Które wyjątki muszę łapać, a które nie? checked musze lapac (Exception), unchecked nie musze (RuntimeException)
        //TODO: Które wyjątki muszę jawnie przekazywać wyżej? checked chyba, ze je obsluze
        //TODO: Co zrobić jeśli nie chcę nic robić z wyjątkiem checked (wrapowanie) OK
        //TODO: Własne wyjątki OK
        //TODO: Wiadomości w wyjątkach OK
        //TODO: Co się stanie jeśli nie złapiemy wyjątku unchecked OK
        //TODO: Jak wyjątki "przesuwają się wyżej w metodach" OK
        //TODO: Jak czytać stacktrace OK
        //TODO: Aplikacja - Walidacja telefonu (regex) i wyjątek
        //TODO: Jak będzie wyglądała aplikacja z checked a jak z unchecked
        //TODO: pipowanie wyjątków
        //TODO: wiele catchy

        //throw new RuntimeException("Test test");




        System.out.println(readFileThisMethodMakeNoSeanse());
    }


    public static String readFileThisMethodMakeNoSeanse() throws IOException {
        FileReader fileReader = new FileReader();
        fileReader.printLineFromFile();
        return "test";
    }

}
