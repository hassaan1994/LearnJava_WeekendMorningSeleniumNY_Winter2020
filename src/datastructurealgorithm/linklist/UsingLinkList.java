package datastructurealgorithm.linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UsingLinkList {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        String stateNJ="NJ";
        String stateFL="FL";

        list.add(stateFL);
        list.add("NY");
        list.add(stateFL);
        list.add("VA");
        list.add("CA");
        list.add("NC");

        // Alternative Of For Each Loop
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("************************************");

        // list.removeAll(list);
        // Remove A Node

        list.remove(2);
        System.out.println("After Remove ");
        Iterator it2=list.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("************************************");

        System.out.println(list.get(3));
        System.out.println(list.size());

    }


}
