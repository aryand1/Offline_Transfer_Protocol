// File: OneTimeCodeStore.java
import java.security.SecureRandom;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;

public class OneTimeCodeStore {
    private ConcurrentHashMap<String, CardData> store = new ConcurrentHashMap<>();
    private SecureRandom random = new SecureRandom();

    public String generateOneTimeCode(CardData cardData) {
        byte[] randomBytes = new byte[24];
        random.nextBytes(randomBytes);
        String code = Base64.getUrlEncoder().encodeToString(randomBytes);
        store.put(code, cardData);
        return code;
    }

    public CardData retrieveData(String code) {
        return store.remove(code); // This removes the entry, making the code one-time use
    }
}

class CardData {
    String cardNumber;
    String expiryDate;
    String cardholderName;

    public CardData(String cardNumber, String expiryDate, String cardholderName) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cardholderName = cardholderName;
    }
}
