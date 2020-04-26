package singleton;

public class TestComputer {

    public static void main(String[] args) {

        Computer myComputer=Computer.getInstance();
        myComputer.ramSize=32;
        System.out.println(myComputer.ramSize);

        Computer yourComputer=Computer.getInstance();
        myComputer.price=3200;
        System.out.println(myComputer.price);
    }


}




