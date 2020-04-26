package inheritance;

public class Father extends GrandFather {
    // Single level inheritance

    public String favoriteDish="Karahi";
    public String fatherSSN="5557776321";

    private String fatherAccountNUmber="5254658965";

    public Father() {
    }

    public Father(String fatherSSN) {
        fatherSSN = fatherSSN;
    }

    public Father(String favoriteDish, String fatherSSN) {
        this.favoriteDish = favoriteDish;
        fatherSSN = fatherSSN;
    }

    public String getFatherAccountNUmber() {
        return fatherAccountNUmber;
    }

    public void swim () {

        System.out.println("Father can swim");
    }
    public void educate(){

        System.out.println("Father can educate others");
    }
    public void qualification() {

        System.out.println("Father is a businessman");
    }
    public void bikeRider() {

        System.out.println("Father can ride bike");
    }
    @Override
    public void jump(){
        System.out.println("Father can jump");

    }

}
