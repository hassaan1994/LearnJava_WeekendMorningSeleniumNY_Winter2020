package inheritance;

public class Son extends Father {
    // Multi level inheritance
    public String favoriteGame="Cricket";
    public String sonSSN="747011668";

    private String sonAccountNUmber="9294028663";

    public Son() {
    }

    public Son(String sonSSN) {
        this.sonSSN = sonSSN;
    }

    public Son(String favoriteGame, String sonSSN) {
        this.favoriteGame = favoriteGame;
        this.sonSSN = sonSSN;
    }

    public String getSonAccountNUmber() {
        return sonAccountNUmber;
    }

    public void setSonAccountNUmber(String sonAccountNUmber) {
        this.sonAccountNUmber = sonAccountNUmber;
    }

    public void bodyBuilder(){
        System.out.println("Good Fitted Body");
    }
    public void playGame(){
        System.out.println("Love To Play Cricket");
    }
    @Override
    public void jump(){

        System.out.println("Son can jump");
    }

}
