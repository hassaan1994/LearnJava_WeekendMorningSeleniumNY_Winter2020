package datastructurealgorithm.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseListHashMap {

    public static void main(String[] args) {
        List<String >stateOfUSA=new ArrayList<>();
        stateOfUSA.add("NY");
        stateOfUSA.add("NJ");
        stateOfUSA.add("Fl");
        stateOfUSA.add("NC");
        stateOfUSA.add("VA");

        List<String >stateOfCANADA=new ArrayList<>();
        stateOfCANADA.add("ONTARIO");
        stateOfCANADA.add("ALBERTA");
        stateOfCANADA.add("MONTREAL");
        stateOfCANADA.add("VANCOUVER");
        stateOfCANADA.add("OTTAWA");

        List<String >stateOfPAKISTAN=new ArrayList<>();
        stateOfPAKISTAN.add("SINDH");
        stateOfPAKISTAN.add("PUNJAB");
        stateOfPAKISTAN.add("BALOUCHISTAN");
        stateOfPAKISTAN.add("KHYBER PAKHTUNKHWA");
        stateOfPAKISTAN.add("GILGIT BALTISTAN");


        // MAP<K,V> name=new HashMap<>();

        Map<String,List<String>> map=new HashMap<>();
        map.put("USA",stateOfCANADA);
        map.put("CANADA",stateOfCANADA);
        map.put("PAKISTAN",stateOfPAKISTAN);

        for (Map.Entry<String,List<String>> entry: map.entrySet()) {
            System.out.println(entry.getKey()+""+entry.getValue());
        }


    }



}
