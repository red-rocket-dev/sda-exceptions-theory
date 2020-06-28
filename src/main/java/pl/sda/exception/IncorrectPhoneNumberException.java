package pl.sda.exception;

public class IncorrectPhoneNumberException extends RuntimeException{
    public IncorrectPhoneNumberException() {
        super("Niepoprawny numer telefonu");
    }
}
