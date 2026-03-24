package edu.norcocollege.cis18b.weekx.mini03;

public class AlertValidatorDemo {

    public static void main(String[] args) {

        String alert = ""; // invalid on purpose

        try {
            validateAlert(alert);
            System.out.println("Alert is valid.");
        } catch (InvalidAlertException e) {
            System.out.println("Invalid alert: " + e.getMessage());
        }
    }

    public static void validateAlert(String alert) throws InvalidAlertException {

        if (alert == null || alert.isBlank()) {
            throw new InvalidAlertException("Alert cannot be empty.");
        }
    }
}