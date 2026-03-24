package edu.norcocollege.cis18b.weekx.mini05;

public class DebuggingDemo {

    public static void main(String[] args) {
        String[] alerts = {"CPU High", "Disk Full", "Login Failure"};

        // Fixed loop (no off-by-one error)
        for (int i = 0; i < alerts.length; i++) {
            System.out.println("Processing alert: " + alerts[i]);
        }
    }
}