package inheritance;

public class Test {

    public static void main(String[] args) {
        Father abidFather=new Father();
        abidFather.jump();

    Son abid=new Son();
    abid.jump();
    abid.bodyBuilder();
    abid.setSonAccountNUmber("846465461");
    System.out.println(abid.getSonAccountNUmber());

    Daughter anika=new Daughter();
    anika.jump();

    GrandFather nizam=new Son();
    nizam.jump();
    nizam.height();

    }





}
