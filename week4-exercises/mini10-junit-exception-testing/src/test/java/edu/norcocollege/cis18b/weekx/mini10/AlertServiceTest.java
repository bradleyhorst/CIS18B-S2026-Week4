package edu.norcocollege.cis18b.weekx.mini10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlertServiceTest {

    @Test
    void shouldThrowProcessingExceptionWhenRepositoryFails() {
        AlertRepository repo = new AlwaysFailRepository();
        AlertService service = new AlertService(repo);

        Alert alert = new Alert("Test alert", AlertLevel.HIGH);

        assertThrows(AlertStorageException.class, () -> {
            service.process(alert);
        });
    }

    @Test
    void shouldProcessSuccessfullyWithValidRepository() {
        AlertRepository repo = new InMemoryAlertRepository();
        AlertService service = new AlertService(repo);

        Alert alert = new Alert("Test alert", AlertLevel.LOW);

        assertDoesNotThrow(() -> {
            service.process(alert);
        });
    }
}