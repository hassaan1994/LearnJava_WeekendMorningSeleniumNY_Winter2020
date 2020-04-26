package controlflow;

public class WhileLoop {
    public static void main(String[] args) {
        int number1=60;
        int number2=56;

        // while(){}
        // Pre Condition
        while(number1>55){
            System.out.println("We are learning While Loop");
            number1--;

        }
        System.out.println("*****************************");

        // Nested While Loop
        int num1=59;
        int num2=55;
        while(num1>55){
            System.out.println("We are learning Nested While Loop");
            num1--;
        while(num2<60){
            System.out.println("Nested While Loop");
            num2++;
        }
        }
    }


}
