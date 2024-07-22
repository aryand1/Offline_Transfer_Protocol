import java.util.Scanner;

public class OneTimeCodeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static OneTimeCodeStore store = new OneTimeCodeStore();

    public static void main(String[] args) {
        System.out.println("Are you logging in as an Owner or an Employee? (owner/employee)");
        String role = scanner.nextLine().trim().toLowerCase();

        System.out.println("Do you have a one-time code, or do you need to generate one? (have/need)");
        String codeStatus = scanner.nextLine().trim().toLowerCase();
        String oneTimeCode = "";

        if ("need".equals(codeStatus)) {
            CardData cardData = new CardData("1234-5678-9012-3456", "12/25", "John Doe", 0.0, "Initial Description");
            oneTimeCode = store.generateOneTimeCode(cardData);
            System.out.println("Generated One-Time Code: " + oneTimeCode);
        }

        do {
            System.out.println("Please enter your one-time code to access the card details:");
            oneTimeCode = scanner.nextLine().trim();

            CardData retrievedCardData = store.retrieveData(oneTimeCode);
            if (retrievedCardData != null) {
                displayCardData(retrievedCardData, role, oneTimeCode);
                break;
            } else {
                System.out.println("Invalid or expired code. Please try again.");
            }
        } while (true);

        scanner.close();
    }

    private static void displayCardData(CardData cardData, String role, String oneTimeCode) {
        System.out.println("Card Number: " + cardData.cardNumber);
        System.out.println("Expiry Date: " + cardData.expiryDate);
        System.out.println("Cardholder Name: " + cardData.cardholderName);
        System.out.println("Transaction Amount: $" + cardData.amount);
        System.out.println("Description: " + cardData.description);

        if ("owner".equals(role)) {
            System.out.println("Do you want to edit the description of the transaction? (yes/no)");
            if (scanner.nextLine().trim().toLowerCase().equals("yes")) {
                editCardDescription(cardData);
                store.updateCardData(oneTimeCode, cardData);
            }
        }
    }

    private static void editCardDescription(CardData cardData) {
        System.out.println("Enter the new description (current: " + cardData.description + "):");
        cardData.description = scanner.nextLine().trim();
        System.out.println("Updated Description: " + cardData.description);
    }
}
