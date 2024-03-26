import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ElevenProof {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean validAccountNumberEntered = false;

        while (!validAccountNumberEntered) {
            try {
                validAccountNumberEntered = validateAccountNumber(prompt("Voer een rekeningnummer in van 9 getallen:"));
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        System.out.println("Gefeliciteerd, je hebt een valide rekeningnummer ingevoerd.");
    }

    private static String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    static boolean validateAccountNumber(String accountNumber) throws IllegalArgumentException {
        String formattedAccountNumber = removeDots(accountNumber);

        if (formattedAccountNumber.length() != 9)
            throw new IllegalArgumentException("Je hebt een onjuist aantal getallen ingevoerd.");

        int sum = 0;

        AtomicInteger index = new AtomicInteger(9);

        for (int i = 0; i < formattedAccountNumber.length(); i++) {
            sum += index.getAndDecrement() * Character.getNumericValue(formattedAccountNumber.charAt(i));
        }

        boolean valid = sum % 11 == 0;

        if (valid) return true;

        throw new IllegalArgumentException("Het ingevoerde rekeningnummer komt niet door de ElevenProof.");
    }

    static String removeDots(String accountNumber) throws IllegalArgumentException {
        return accountNumber.replaceAll("\\.", "");
    }
}
