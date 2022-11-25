package org.academiadecodigo.thisfunctional.ArabianNights;

public class Friendly extends Genie{

    public Friendly(int numbWishes){
        super(numbWishes);
    }
    @Override
    public void makeWishes(){

        if (super.getMaxWishes() >= super.getGrantedWishes()){
            System.out.println("You still have wishes left");


        } else {
            System.out.println("All your wishes were granted");
        }
        super.makeWishes();
    }


}
