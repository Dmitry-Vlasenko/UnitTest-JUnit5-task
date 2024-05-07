package com.dvlasenko.app.models;

import com.dvlasenko.app.utils.TemperatureOutOfRangeException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureValidatorTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 25, -10, 35, 11, -3})
    void testValidTemperature(int temperature) {
        TemperatureValidator validator = new TemperatureValidator();
        assertDoesNotThrow(() -> validator.validateTemperature(temperature));
    }

    @ParameterizedTest
    @ValueSource(ints = {-11, -100 ,36, 100})
    void testInvalidTemperature(int temperature) {
        TemperatureValidator validator = new TemperatureValidator();
        assertThrows(TemperatureOutOfRangeException.class, () -> validator.validateTemperature(temperature));
    }
}
