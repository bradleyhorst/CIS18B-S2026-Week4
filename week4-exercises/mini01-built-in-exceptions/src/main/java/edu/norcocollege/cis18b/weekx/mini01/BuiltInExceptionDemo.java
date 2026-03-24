public static void main(String[] args) {
    int numerator = 10;
    int denominator = 0;
    String[] alerts = {"CPU High", "Disk Full", "Login Failure"};

    try {
        int result = numerator / denominator;
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero.");
    }

    try {
        System.out.println(alerts[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid alert index.");
    }

    System.out.println("Program completed.");
}