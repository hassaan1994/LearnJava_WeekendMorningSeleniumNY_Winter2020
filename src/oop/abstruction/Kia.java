package oop.abstruction;

public class Kia extends NewCar implements Car {

    String kiaCarModel="M20";
    double kiaCarPrice=50000.500;


    public void startCar() {
        System.out.println("Kia SUV has start functionality");
    }


    public void stopCar() {
        System.out.println("Kia SUV has stop functionality");

    }


    public void carEngine() {
        System.out.println("Kia SUV has ENGINE");

    }


    public void carWheel() {
        System.out.println("Kia SUV has Wheels");

    }


    public void carChassis() {
        System.out.println("Kia SUV has Chassis");

    }
    // Concrete Class: Kia

    public void heater(){
        System.out.println("Kia suv has Heater");
    }
    public void preCollisionWarning(){
        System.out.println("Kia suv has Pre Collision Warning");
    }


    public void gprs() {
        System.out.println("Kia suv has GPRS");
    }


    public void carDisplay() {
        System.out.println("Kia suv has Display");
    }
}
