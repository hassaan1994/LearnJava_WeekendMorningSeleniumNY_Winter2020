package exceptionhandling;

public class UsingThrows {
    public void doDivision (int number1, int number2) throws ArithmeticException {
        int num1=number1;
        int num2=number2;
        int division=num1/num2;
        System.out.println(division);
        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        UsingThrows my=new UsingThrows();
        my.doDivision(30,5);
        my.doDivision(30,0);
    }
}
