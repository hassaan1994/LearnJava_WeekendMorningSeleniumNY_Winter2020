package singleton;

public class Computer {

    int ramSize=16;
    int price=2000;

    private Computer(){


    }
    private static Computer instance=new Computer();
    public static Computer getInstance(){

        return instance;
    }

}