package pl.sda;

import pl.sda.exception.IncorrectPhoneNumberException;

import java.util.Scanner;

public class PhoneValidationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer telefonu ###-###-###:");
        String phoneNumber = scanner.nextLine();

        if(!phoneNumber.matches("\\d{3}-\\d{3}-\\d{3}")) {
            throw new IncorrectPhoneNumberException();
        }
    }
}
