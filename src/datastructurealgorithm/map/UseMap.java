package datastructurealgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    // Map:
    // Map<K,V>
    // Key : Value
    // Name : Anika

    public static void main(String[] args) {
        Map<String,String> stateMap=new HashMap<>();
        stateMap.put("USA","NY");
        stateMap.put("CANADA","ON");
        stateMap.put("USA","NJ");
        stateMap.put("JAPAN","TOKYO");
        stateMap.put("PAKISTAN","HYDERABAD");

        // Retrieve Value

        for (Map.Entry<String,String> entry : stateMap.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        System.out.println("****************************************");
        // Retrieve Value Another Approach
        for (String st:stateMap.keySet()) {
            System.out.println(st+" : "+stateMap.get(st));
        }



    }



}
