package datastructurealgorithm.array;

import java.util.ArrayList;

public class UseArrayList {
    // ArrayList: No Need To Declare Array Size / Dynamic Array



    public static void main(String[] args) {

        ArrayList<String> studentList=new ArrayList<String>();
        // add() To Insert Value In Array List
        studentList.add("Anika");
        studentList.add("Mahid");
        studentList.add("Farjana");
        studentList.add("Mezba");
        studentList.add("Nafis");

        System.out.println(studentList.get(3));
        studentList.remove(2);

        for (String st:studentList) {
            System.out.println(st);
        }
    }




}
