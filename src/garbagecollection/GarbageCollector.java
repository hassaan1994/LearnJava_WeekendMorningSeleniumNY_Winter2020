package garbagecollection;

public class GarbageCollector {
    String name="Alex";
    String address="queens, NY";

    public static void main(String[] args) {
        GarbageCollector gCol=new GarbageCollector();
        GarbageCollector gCol1=new GarbageCollector();
        GarbageCollector gCol2=new GarbageCollector();
        GarbageCollector gCo3=new GarbageCollector();

        System.out.println(gCol.name);
        System.gc();
        Runtime.getRuntime().gc();
    }




}
