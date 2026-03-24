package edu.norcocollege.cis18b.weekx.mini06;

public class RepositoryDemo {

    public static void main(String[] args) {

        AlertRepository repo = new InMemoryAlertRepository();

        try {
            repo.save(null); // intentionally bad
        } catch (Exception e) {
            throw new RuntimeException("Failed to save alert", e);
        }
    }
}