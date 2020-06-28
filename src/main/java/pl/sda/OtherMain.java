package pl.sda;

import pl.sda.exception.MyException;

public class OtherMain {
    public static void main(String[] args) {
        MyExceptionThrowingClass someObject = new MyExceptionThrowingClass();

        anotherMethodWithoutPoint(someObject);
    }

    private static void anotherMethodWithoutPoint(MyExceptionThrowingClass someObject) {
        System.out.println("Costam costam");
        try {
            someObject.imThrowingException();
        } catch(MyException e) {
            throw new RuntimeException(e);
        }
    }
}
