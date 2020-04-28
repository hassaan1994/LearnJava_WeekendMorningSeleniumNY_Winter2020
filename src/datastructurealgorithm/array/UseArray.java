package datastructurealgorithm.array;

public class UseArray {

    // Array: Array Help Us To Initialize More Than One Value For A Single Variable.
    // Single Dimensional Array []
    // 2D Array
    // 3D Array

    static String name="Tanjina"; // Variable declare and initialization

    // Array:
    // Index Number: Call By Index Number And Index Number Start With 0
    static String[] stName={"Marufa","Anika","Mahid","Shamima"}; // Declare And Initialize Value In Array

    static String[] adminName={"Jack","James","William","Salah"};

    static String[] stAddress=new String[6]; // Array Declaration / Limitation
    // Initialiazation Is Not Possible If You Declare Earlier

    public static void main(String[] args) {
        System.out.println(name); // Variable

        System.out.println(stName[0]); // Array
        System.out.println(stName[1]); // Array
        System.out.println(stName[2]); // Array
        System.out.println(stName[3]); // Array
        stAddress[0]="Queens,NY";
        stAddress[1]="Jamaice,NY";
        stAddress[2]="Bronx,NY";
        stAddress[3]="Manhattan,NY";
        stAddress[4]="Yonkers,NY";
        stAddress[5]="Brooklyn,NY";
        System.out.println(stAddress[3]);
        System.out.println(stAddress.length);

        System.out.println("***********************************");

        // Retrieve Data From Array Using For Loop
        for (int i=0; i<stAddress.length; i++){
            System.out.println(stAddress[i]);
        }
        System.out.println("********************* Using For Each Loop ****************");
        // Retrieve Data From An Array Using For Each Loop
        //for (DataType variableName:ArrayName){
        //    System.out.println(variableName);
        // }

        for (String address:stAddress) {
            System.out.println(address);
        }

        System.out.println("*********************** Array Out Of Bound Exception ***********************");
        try{
            System.out.println(stAddress[6]);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out Of Bound Exception");
        }

        System.out.println(stName[1]+" And "+ stName[2]+" Are Good Friend");

        int [] numbers={1,2,3,4,5};
        System.out.println(numbers[1]);

        for (int num:numbers){
            System.out.print(num);
        }
    }


}
