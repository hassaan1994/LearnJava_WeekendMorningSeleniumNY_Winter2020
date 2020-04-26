package controlflow;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int i=0; i<4; i++){ //Parent Forloop Start
            System.out.println("We Are Learning Nested ForLoop");


            for(int j=0; j<2; j++){
                System.out.println("Nested");
            }

        } // Parent ForLoop End

        // User will give the number and it wil print as a row basis

        //Output
        // 1
        // 12
        // 123
        // 1234
        // 12345

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int rowNumber=input.nextInt();

        for (int i=1; i<rowNumber; i++){

            for(int j=1; j<=i; j++){
                System.out.println(j+" ");
            }
            System.out.println();
        }



    }
}
