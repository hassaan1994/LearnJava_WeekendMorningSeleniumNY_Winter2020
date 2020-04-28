package datastructurealgorithm.linklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseList {

    // ArrayList Vs LinkedList

    public static void main(String[] args) {
        //List type of Array using ArrayList
        List<String> fruitsList=new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Orange");
        fruitsList.add("Banana");
        fruitsList.add("Mango");
        fruitsList.add("Cherry");

        System.out.println(fruitsList.get(2));
        // Retrieve Data From ArrayList
        for (String st:fruitsList) {
            System.out.println(st);
        }

        // List type of Array using LinkedList
        List<String> stList=new LinkedList<>();

        stList.add("Anika");
        stList.add("Mahid");
        stList.add("Farjana");
        stList.add("Mezba");
        stList.add("Nafis");
        System.out.println(stList.get(3));
        for (String st:stList) {
            System.out.println(st);
        }
        UseList.displayPizzaList();

    }

        static List<String> pizzaList=new ArrayList<>();
        public static void displayPizzaList(){
            pizzaList.add("New York Style Pizza");
            pizzaList.add("Italian Pizza");
            pizzaList.add("Mexican Pizza");
            pizzaList.add("Cheese Lover");

            for (String st:pizzaList) {
                System.out.println(st);
            }
        }

}
