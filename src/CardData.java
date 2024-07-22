public class CardData {
    String cardNumber;
    String expiryDate;
    String cardholderName;
    double amount;       // To store transaction amount
    String description;  // To store a description of the transaction or other notes

    // Constructor updated to include all fields
    public CardData(String cardNumber, String expiryDate, String cardholderName, double amount, String description) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cardholderName = cardholderName;
        this.amount = amount;  // Initialize amount
        this.description = description;  // Initialize description
    }
}

