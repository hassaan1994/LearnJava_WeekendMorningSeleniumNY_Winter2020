package debugging;
import java.util.Scanner;
public class Calculator {

    //Debugging: De+Bug
    public static void main(String[] args) {
        int number1 = 55;
        int number2 = 65;

        int summation = number2 - number1;
        System.out.println("Summation Value Is " + summation);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int rowNumber=input.nextInt();
        for (int i=1; i<=rowNumber; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }



    }







}
