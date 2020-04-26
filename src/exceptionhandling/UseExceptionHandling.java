package exceptionhandling;

public class UseExceptionHandling {
    public static void main(String[] args) throws ArithmeticException {



        try {
            int num1=10;
            int num2=2;
            int division=num1/num2;
            System.out.println(division);


        } catch (Exception e ) {
            e.printStackTrace();
            System.out.println("This is Arithmetic Exception");
        }

        // Multi Try Catch

        try {


        } catch (Exception e) {

            try{

            } catch (Exception el) {

            }
        }
        System.out.println("***************************");
        // Multi Catch Block
        try {
            int num1=10;
            int num2=0;
            int division=num1/num2;
            System.out.println(division);

        } catch (ArithmeticException e1) {
            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e2){
            System.out.println("Null Point Exception");
        }finally {
            // Finally block always execute
            int num1=10;
            int num2=3;
            int division=num1/num2;
            System.out.println(division);
            System.out.println("Value Will Be Print");
        }
        // Finally:
    }


}
