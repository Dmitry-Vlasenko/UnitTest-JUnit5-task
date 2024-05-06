package com.dvlasenko.app;


import com.dvlasenko.app.controllers.TemperatureController;

public class App {

    public static void main(String[] args) {
        TemperatureController controller = new TemperatureController();
        controller.start();
    }
}
