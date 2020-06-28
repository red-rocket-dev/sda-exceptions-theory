package pl.sda.exception;

public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
        super("My runtime exception");
    }
}
