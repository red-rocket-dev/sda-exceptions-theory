package pl.sda;

import pl.sda.exception.MyException;
import pl.sda.exception.MyRuntimeException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class StudentDatabase {
    public List<Student> retrieve() {
        try {
            Files.newBufferedReader(Path.of("plik.txt"));
            /*Thread thread = new Thread(new PrintingRunnable());
            thread.start();
            thread.join();*/
            throwMyRuntimeException();
            throwMyException();
        } catch (MyRuntimeException | IOException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Runtime!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("Błąd MyException!");
        } finally {
            System.out.println("To jest zawsze");
        }
        return Collections.emptyList();
    }

    private void throwMyRuntimeException() {
        throw new MyRuntimeException();
    }

    private List<Student> throwMyException() throws MyException {
        throw new MyException();
    }
}
