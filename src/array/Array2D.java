package array;

import org.w3c.dom.ls.LSOutput;

public class Array2D {

    // 2D Array: Two Dimension [Row] [Column]

    static String[] stName={"Marufa","Anika","Mahid","Shamima"};

    static String[] [] address=new String[6][5];

    public static void main(String[] args) {

        address[0][0]="Queens1,NY";
        address[0][1]="Queens2,NY";
        address[0][2]="Queens3,NY";
        address[0][3]="Queens4,NY";
        address[0][4]="Queens5,NY";

        address[1][0]="Queens6,NY";
        address[1][1]="Queens7,NY";
        address[1][2]="Queens8,NY";
        address[1][3]="Queens9,NY";
        address[1][4]="Queens10,NY";

        address[2][0]="Queens11,NY";
        address[2][1]="Queens12,NY";
        address[2][2]="Queens13,NY";
        address[2][3]="Queens14,NY";
        address[2][4]="Queens15,NY";

        System.out.println(address[2][2]);

        for (String add[]: address) {
            for (String ad:add) {
                System.out.println(ad);
            }
        }
        // Declare And Initialize 2D Array

        int [][] id= {
                // 3 Rows

                {1, 2},
                {3, 4},
                {5, 6},
                {7,8}
        };

        System.out.println(id.length);



    }




}