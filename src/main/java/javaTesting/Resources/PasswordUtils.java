package javaTesting.Resources;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class PasswordUtils {

    public static final Random RANDOM = new SecureRandom();
    public static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWKYZÑÇ";

    public static String genSalt() {
        return genSalt(8);
    }

    public static String genSalt(int length) {
        StringBuilder value = new StringBuilder();

        for (int i = 0; i < length; i++) {
            value.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return value.toString();
    }

    public static String saltPassword(String password, String salt) {
        return hashPassword(password, salt);
    }

    public static String hashPassword(String password, String salt) {
        MessageDigest messageDigest;

        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Unknown hashing algorithm", e);
        }

        messageDigest.update((salt + password).getBytes(StandardCharsets.UTF_8));
        return Arrays.toString(messageDigest.digest());
    }

    public static boolean verifyPassword(String password, String salt, String securePassword) {
        return securePassword.equals(hashPassword(password, salt));
    }

}
