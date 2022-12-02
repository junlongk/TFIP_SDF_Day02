package models;

import java.util.Date;

public class Car {

    // Properties
    private String colour;
    private String make;
    private String registration;
    private Date registrationDate;
    private Integer acceleration = 0;

    public Car() { }
    // When you add a constructor, the default constructor disappears
    public Car(String registration) {
        this.registration = registration;
    }
    public Car(String registation, String colour, String make) {
        this.registration = registation;
        this.colour = colour;
        this.make = make;
    }

    // Access methods to our members
    // getMemberName, setMemberName
    public String getColour() {
        return this.colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getMake() {
        return this.make;
    }
    public void setMake(String make) {
        switch (make.toLowerCase()) {
            case "honda":
            case "toyota":
            case "mazda":
                this.make = make;
                break;
            
            default:
        }
        this.make = make;
    }

    public String getRegistration() {
        return registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public Date getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    public Integer getAcceleration() {
        return acceleration;
    }

    // Behaviour - method
    public void horn() {
        System.out.println("horn horn horn");
    }

    public void accelerate() {
        if (this.acceleration < 200)
            this.acceleration++;
    }

    public void accelerate(Integer n) {
        for (Integer i = 0; i < n; i++)
            this.accelerate();
    }

    public void decelerate() {
        if (this.acceleration > 0)
            this.acceleration--;
    }
}