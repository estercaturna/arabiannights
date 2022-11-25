package org.academiadecodigo.thisfunctional.ArabianNights;

public class Genie {

    private int maxWishes; // max wishes you can ask
    private int grantedWishes = 0; // number of wishes granted by the genies

    //***********
    public int getMaxWishes() {
        return maxWishes;
    }
    public int getGrantedWishes() {
        return grantedWishes;
    }

    //**********

    // if maxGenies(friendly + Grumpy) exhaust return Demon
    public Genie(int maxWishes) {
        this.maxWishes = maxWishes;

    }
    public void makeWishes(){
        System.out.println("Making your wish come true: " + grantedWishes);
        grantedWishes++;
    }

}
