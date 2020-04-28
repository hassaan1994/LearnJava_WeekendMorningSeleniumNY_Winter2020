package array;

import oop.encapsulation.Student;

public class Students {

    static String[] stName={"Marufa","Anika","Mahid","Shamima"};

    static String[] address=new String[6];

    // Passing Array To Methods

    public void printAddress(){

        address[0]="Queens,NY";
        address[1]="Jamaice,NY";
        address[2]="Bronx,NY";
        address[3]="Manhattan,NY";
        address[4]="Yonkers,NY";
        address[5]="Brooklyn,NY";

        for (String ad:address){
            System.out.println("Address Is " + ad);
        }

    }

    public static void printStudentName(){

        for (String st:stName){
            System.out.println("Student Name :" + st);
        }

    }

    public static int [] reverse (int [] list) {
        int [] result = new int [list.length];

        for (int i=0, j=result.length -1; i<list.length; i++, j--) {
            result[j] = list[i];
        }
        System.out.println(result);
        return result;
    }




    public static void main(String[] args) {
        // Main Method Should Be Neat And Clean

            Students.printStudentName();

            Students student=new Students();
            student.printAddress();

    }

}
