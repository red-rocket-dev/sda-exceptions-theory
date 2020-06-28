package pl.sda;

import pl.sda.exception.MyException;

public class MyExceptionThrowingClass {
    public void imThrowingException() throws MyException {
        throw new MyException();
    }
}
