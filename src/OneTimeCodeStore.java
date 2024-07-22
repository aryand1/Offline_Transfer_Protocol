// File: OneTimeCodeStore.java
import java.security.SecureRandom;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;

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
        System.out.println("Generated and stored new data with code: " + code);  // Diagnostic output
        return code;
    }

    public CardData retrieveData(String code) {
        CardData data = store.get(code);
        if (data != null) {
            System.out.println("Data retrieved for code: " + code);  // Diagnostic output
        } else {
            System.out.println("No data found for code: " + code);  // Diagnostic output
        }
        return data;
    }

    public void updateCardData(String code, CardData cardData) {
        store.put(code, cardData);
        System.out.println("Data updated for code: " + code);  // Diagnostic output
    }
}


