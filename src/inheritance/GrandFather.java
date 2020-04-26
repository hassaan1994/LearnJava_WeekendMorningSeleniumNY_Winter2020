package inheritance;

public class GrandFather {
    public String favoriteDish="Biryani";
    public String grandFatherSSN="2223334444";
    private String grandFatherAccountNUmber="343564123";


    public GrandFather() {
    }

    public String getGrandFatherAccountNUmber() {
        return grandFatherAccountNUmber;
    }

    public void setGrandFatherAccountNUmber(String grandFatherAccountNUmber) {
        this.grandFatherAccountNUmber = grandFatherAccountNUmber;
    }

    public void height(){
        System.out.println("Grand Father Height Was 6.2");
    }
    public void hairColor(){
        System.out.println("Grand Father Hair Color Was Black");
    }
    public void jump(){
        System.out.println("Grand father can jump");

}


}
