package datastructurealgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTraverse {

    public static void main(String[] args) {
        int [] num={23,445,67,35,89,78,123,45,35,78,445,78,500};

        printFrequency(num);


    }

    public static void printFrequency(int[] arr){
        // Wrapper Class : Integer
        // Create An Empty HashMap
        HashMap<Integer,Integer> hmap=new HashMap<>();

        for (int i=0; i<arr.length; i++){
            Integer c=hmap.get(arr[i]);

            // If this is first occurrence
            if (hmap.get(arr[i])== null){
                hmap.put(arr[i],1);
            }else {
                hmap.put(arr[i],++c);
            }
        }
        // Retrieve Valur
        for (Map.Entry m : hmap.entrySet()) {
            System.out.println("Frequency Of "+ m.getKey()+" : "+m.getValue());
        }




    }





}
