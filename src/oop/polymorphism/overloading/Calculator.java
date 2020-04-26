package oop.polymorphism.overloading;

public class Calculator {

    public int multiply(int number1, int number2) {
        int num1 = number1;
        int num2 = number2;
        int multiply=number1/number2;
        System.out.println("Multiplication Of These 2 Numbers Are " + multiply);


        return multiply;
    }

    public int multiplication (int number1, int number2, int number3) {
        int num1 = number1;
        int num2 = number2;
        int num3 = number3;
        int multiplication=num1 * num2*num3;
        System.out.println("Multiplication Of These 3 Numbers Are " + multiplication);


        return multiplication;
    }
    public int multiplication (int number1, int number2, int number3, int number4) {
        int num1 = number1;
        int num2 = number2;
        int num3 = number3;
        int num4 = number4;
        int multiplication=num1*num2*num3*num4;
        System.out.println("Multiplication Of These 4 Numbers Are " + multiplication);


        return multiplication;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiply(60,50);
        calculator.multiplication(20,30,40);
        calculator.multiplication(20,30,40,50);
    }
}
