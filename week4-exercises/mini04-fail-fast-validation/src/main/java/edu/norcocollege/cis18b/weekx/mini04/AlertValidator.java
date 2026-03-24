package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidator {

    public static void validate(String message) {

        if (message == null) {
            throw new IllegalArgumentException("Message cannot be null");
        }

        if (message.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }

        if (message.length() < 5) {
            throw new IllegalArgumentException("Message must be at least 5 characters long");
        }
    }
}