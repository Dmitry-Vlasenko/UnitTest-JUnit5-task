package com.dvlasenko.app.models;


import com.dvlasenko.app.utils.TemperatureOutOfRangeException;

public class TemperatureValidator {

    public void validateTemperature(int temperature) throws TemperatureOutOfRangeException {
        if (temperature < -10 || temperature > 35) {
            throw new TemperatureOutOfRangeException("Temperature out of range.");
        }
    }
}