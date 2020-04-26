package inheritance;

public class Daughter extends Father{
    public String favouriteClothing="Shalwar Kameez";
    public String daughterSSN="6542587532";

    private String daughterAccountNUmber="7896541236";

    public Daughter() {
    }

    public Daughter(String daughterSSN) {
        this.daughterSSN = daughterSSN;
    }

    public Daughter(String favouriteClothing, String daughterSSN) {
        this.favouriteClothing = favouriteClothing;
        this.daughterSSN = daughterSSN;
    }

    public String getDaughterAccountNUmber() {

        return daughterAccountNUmber;
    }

    public void setDaughterAccountNUmber(String daughterAccountNUmber) {
        this.daughterAccountNUmber = daughterAccountNUmber;
    }
    public void superGirl(){
        System.out.println("Loves Cooking For Family");
    }
    public void mindReader() {
        System.out.println("Can Read Mind Easily");
    }
     @Override
     public void jump(){
            System.out.println("Daughter Can Jump");



    }

    }
