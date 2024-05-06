package com.dvlasenko.app.utils;

public class TemperatureOutOfRangeException extends Exception {
    public TemperatureOutOfRangeException(String message) {
        super(message);
    }
}