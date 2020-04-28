package array;

public class Array3D {

    // 3D Array= 1D Array + 2D Array
    // Datatype[Size][Row][Column]=new DataType[Size][Row][Column]

    static String [][][] pizza=new String[5][3][4];

    public static void main(String[] args) {

        pizza [0][0][0]="S1";
        pizza [0][0][1]="Pizza Type";
        pizza [0][0][2]="Quantity";
        pizza [0][0][3]="Price";

        pizza [1][1][0]="1";
        pizza [1][1][1]="New York Style Pizza";
        pizza [1][1][2]="Large";
        pizza [1][1][3]="20";

        pizza [2][2][0]="2";
        pizza [2][2][1]="HandTossed Pizza";
        pizza [2][2][2]="Medium";
        pizza [2][2][3]="15";

        System.out.println(pizza[1][1][1]);

        for (String pizzaInfo[][]:pizza) {
            for (String pizzaIn[]:pizzaInfo) {
                for (String pizz:pizzaIn) {
                    System.out.println(pizz);
                }
            }
        }
        System.out.println(pizza.length);

    }


}
