package advance;

public class Recursion {

    // Recursion: process in which a method call itself continuously
    // must call itself
    // must have a base case
    // must change its state and move toward the base case

    static int count=0;

    public static void pizzaInfo(){
        count++;
        if (count<=12){
            System.out.println("Pizza is amazing");
            pizzaInfo();
        }

    }

    public static void main(String[] args) {
        Recursion.pizzaInfo();
    }

}
