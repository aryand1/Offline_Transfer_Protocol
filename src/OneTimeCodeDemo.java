import java.util.Scanner;

public class OneTimeCodeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OneTimeCodeStore store = new OneTimeCodeStore();

        // Ask if the user wants to generate a new one-time code
        System.out.println("Do you want to generate a new one-time code? (yes/no)");
        String response = scanner.nextLine().trim().toLowerCase();

        if ("yes".equals(response)) {
            // Generate new card data and a one-time code
            CardData cardData = new CardData("1234-5678-9012-3456", "12/25", "John Doe");
            String code = store.generateOneTimeCode(cardData);
            System.out.println("One-Time Code: " + code);
            System.out.println("You can use this code to retrieve the associated credit card information once.");
        }

        // Always provide the option to enter a one-time code for data retrieval
        System.out.println("Please enter a one-time code to retrieve the associated credit card information:");
        String enteredCode = scanner.nextLine().trim();
        CardData retrievedCardData = store.retrieveData(enteredCode);
        if (retrievedCardData != null) {
            System.out.println("Card Number: " + retrievedCardData.cardNumber);
            System.out.println("Expiry Date: " + retrievedCardData.expiryDate);
            System.out.println("Cardholder Name: " + retrievedCardData.cardholderName);
        } else {
            System.out.println("Invalid or expired code.");
        }

        scanner.close();
    }
}
