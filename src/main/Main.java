package main;

import java.util.Date;

import models.Car;
import models.TurboChargedCar;

public class Main {
    
    public static void main(String[] args) {

        Car myCar = new Car("SAA1234B");
        Car myOtherCar = new TurboChargedCar("TZZ5678Z");
        // Date date = new Date();
        // java.sql.Date date = new java.sql.Date(); (if we want to use Date from 2 libraries)

        myCar.setColour("red");
        myCar.setMake("Honda");
        myCar.setRegistration("SNX1357N");
        myCar.setRegistrationDate(new Date());

        myCar.horn();
        System.out.printf("color: %s, make: %s, registration: %s\n", myCar.getColour(), myCar.getMake(), myCar.getRegistration());

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();

        System.out.printf("acceleration: %d\n", myCar.getAcceleration());

        if (myOtherCar instanceof TurboChargedCar) {
            // Cast into a TurboChargedCar type
            TurboChargedCar turbo = (TurboChargedCar)myOtherCar;
            turbo.setTurbo(true);
        }
    }

}
