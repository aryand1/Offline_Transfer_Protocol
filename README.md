
# 🗝️ Offline_Transfer_Protocol Store in Java

Welcome to the **Offline_Transfer_Protocol** Java project! This repository provides a secure and efficient method for managing one-time codes linked to sensitive data. The `OneTimeCodeStore` class along with the `OneTimeCodeDemo` class showcases how to generate and retrieve one-time codes in a Java application.

## 🚀 Getting Started

### Prerequisites 🛠️

- **Java Development Kit (JDK) 8 or higher**: Ensure JDK is installed on your machine.
- **An IDE or text editor**: For example, IntelliJ IDEA, Eclipse, or VS Code.

### Setup Instructions 📥

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/one-time-code-store.git
   ```
   
2. **Navigate to the Project Directory:**
   ```bash
   cd one-time-code-store
   ```

3. **Compile the Java Files:**
   ```bash
   javac OneTimeCodeStore.java OneTimeCodeDemo.java CardData.java
   ```

4. **Run the Demo Program:**
   ```bash
   java OneTimeCodeDemo
   ```

## 📜 Code Overview

### `OneTimeCodeStore.java`

This file contains two main classes:

- **`OneTimeCodeStore`**: Manages the generation and retrieval of one-time codes.
- **`CardData`**: Stores sensitive card information including card number, expiry date, and cardholder name.

#### Key Features:

- **Secure Code Generation**: Utilizes `SecureRandom` for generating unpredictable codes.
- **One-Time Use**: Codes are removed from storage after retrieval to ensure single use.
- **Base64 Encoding**: Codes are URL-safe and easy to handle.

### `OneTimeCodeDemo.java`

This file provides a demonstration of how to use the `OneTimeCodeStore` class:

- **Interactive Command-Line Interface**: Allows users to generate new one-time codes and retrieve data using these codes.
- **User Prompts**: Guides users through generating a one-time code or entering an existing code to retrieve associated data.


## 🔒 Security Considerations

- **Sensitive Data Handling**: Ensure that sensitive data, such as card details, is managed securely and complies with relevant data protection regulations.
- **One-Time Code Usage**: Codes are designed for single use to enhance security.

## 💡 Future Enhancements

- **Expiration Time**: Implement functionality to expire codes after a certain time period.
- **Persistent Storage**: Integrate persistent storage solutions to retain codes beyond the application's runtime.

## 📑 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📧 Contact

For questions or feedback, feel free to contact [your-email@example.com](mailto:your-email@example.com).

---

Feel free to update any placeholders or details specific to your project! 🚀🔒

---

Credits: Aryan Singh Dalal
