package com.dvlasenko.app.models;

import com.dvlasenko.app.utils.TemperatureOutOfRangeException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureValidatorTest {

    @Test
    void testValidTemperature() {
        TemperatureValidator validator = new TemperatureValidator();
        assertDoesNotThrow(() -> validator.validateTemperature(0));
        assertDoesNotThrow(() -> validator.validateTemperature(25));
        assertDoesNotThrow(() -> validator.validateTemperature(-10));
        assertDoesNotThrow(() -> validator.validateTemperature(35));
    }

    @Test
    void testInvalidTemperature() {
        TemperatureValidator validator = new TemperatureValidator();
        assertThrows(TemperatureOutOfRangeException.class, () -> validator.validateTemperature(-11));
        assertThrows(TemperatureOutOfRangeException.class, () -> validator.validateTemperature(36));
    }
}
