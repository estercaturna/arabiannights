package org.academiadecodigo.thisfunctional.ArabianNights;

public class MagicLamp {
//vezes q foi recharged
//number of times the lamp hass been rubbed since the last recharged
//max numb genie  the lamp can regenerate
    private String name;

    private int maxGenies;

    private int maxRubs = 0;

    public String getName() {
        return name;
    }

    public int getMaxGenies() {
        return maxGenies;
    }

    public int getMaxRubs() {
        return maxRubs;
    }

    public MagicLamp (String name, int maxGenies){
        this.name = name;
        this.maxGenies = maxGenies;
    }

    public Genie rubLamp() { //sout and when rub rub++ t
        //ternarios a perguntar is even : odd

        int generateGenie = (int) Math.floor(Math.random() * getMaxGenies());

        if (maxGenies >= maxRubs) {

            if (generateGenie % 2 == 0) {
                maxRubs++;
                return new  Friendly(3); //even
            } else {
                maxRubs++;
                return new Grumpy(5); //odd
            }
        }
        return new Demon(4);
    }

    /*public void rechargeLamp(){

        for (maxRubs == maxGenies){
            return new Demon(4);

        }
    }*/


}
