package org.academiadecodigo.thisfunctional.ArabianNights;

public class Grumpy extends Genie {

    public Grumpy(int numbWishes) {

        super(numbWishes);
    }

    @Override
    public void makeWishes(){
        if (super.getGrantedWishes() <= 1){
            super.makeWishes();
            System.out.println("I have granted all the wishes I can.");


        }
    }
}
