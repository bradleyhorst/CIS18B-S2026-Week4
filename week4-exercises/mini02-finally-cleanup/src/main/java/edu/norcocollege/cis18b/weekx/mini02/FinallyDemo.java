public static void main(String[] args) {
    System.out.println("Opening alert stream...");

    try {
        throw new RuntimeException("Something went wrong while processing alerts.");
    } catch (RuntimeException ex) {
        System.out.println("Error: " + ex.getMessage());
    } finally {
        System.out.println("Closing alert stream...");
    }
}