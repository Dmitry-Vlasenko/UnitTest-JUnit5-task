package com.dvlasenko.app.controllers;

import com.dvlasenko.app.utils.TemperatureOutOfRangeException;
import com.dvlasenko.app.models.TemperatureValidator;

import java.util.Scanner;


public class TemperatureController {
    private final TemperatureValidator validator;
    private final Scanner scanner;

    public TemperatureController() {
        validator = new TemperatureValidator();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Enter the temperature or (type 'exit' to quit):");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }
            try {
                int temperature = Integer.parseInt(input);
                validator.validateTemperature(temperature);
                System.out.println("The device can operate at this temperature.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer temperature.");
            } catch (TemperatureOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}