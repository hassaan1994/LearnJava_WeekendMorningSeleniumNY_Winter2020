package oop.encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student anika=new Student();
        // First need to set value then Get value
        anika.setName("Anika Islam");

        System.out.println(anika.getName());

        anika.setAddress("Queens,NY");
        System.out.println(anika.getAddress());

        System.out.println("Name is : " + anika.getName() + " and the address is : " + anika.getAddress());



        Student tanjina=new Student( "Tanjina Rahman");
        tanjina.setAddress("Jamaica,NY");
        System.out.println("Address is "+tanjina.getAddress());


    }

}
