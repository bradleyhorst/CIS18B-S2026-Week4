package edu.norcocollege.cis18b.weekx.mini10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlertValidatorTest {

    @Test
    void shouldThrowExceptionForEmptyMessage() {
        assertThrows(InvalidAlertException.class, () -> {
            AlertValidator.validate("");
        });
    }

    @Test
    void shouldPassForValidMessage() {
        assertDoesNotThrow(() -> {
            AlertValidator.validate("Valid alert message");
        });
    }
}