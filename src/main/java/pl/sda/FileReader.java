package pl.sda;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {
    public void printLineFromFile() throws IOException {
        //..
        //throw new MyRuntimeException();
        BufferedReader bufferedReader = null;
        bufferedReader = Files.newBufferedReader(Path.of("xxx.txt"));
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();

        //TODO: dlaczego wczesniej bez returna dzialalo
    }
    public void doSthWithInt() {

        Integer.valueOf("a");

    }
}
