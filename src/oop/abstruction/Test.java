package oop.abstruction;

public class Test {

    public static void main(String[] args) {
        Kia myKia=new Kia();
        myKia.startCar();
        myKia.carEngine();
        myKia.carWheel();
        myKia.stopCar();
        myKia.gprs();
        myKia.carDisplay();
        myKia.heater();

        BMW myBmw=new BMW();
        myBmw.startCar();
        myBmw.carEngine();
        myBmw.carWheel();
        myBmw.stopCar();
        myBmw.flyingFeature();

        System.out.println("**********************************");

        Car myCar=new Kia();
       //((Kia)myCar).heater();
       //((Kia)myCar).preCollisionWarning();
        myCar.startCar();

        ModernCar myModernCar=new BMW();
        //((BMW)myModernCar).carDisplay();
        myModernCar.camera360view();

        FlyingCar myFlyingCar=new BMW();
        myFlyingCar.flyingFeature();
        //((BMW)myFlyingCar).blueTooth();


        NewCar myNewCar=new Kia();
        NewCar myNewCar1=new BMW();

        myNewCar1.boostEngine();
        myNewCar1.gprs();
        myNewCar1.carDisplay();
        ((BMW)myNewCar1).flyingFeature();


    }

}
