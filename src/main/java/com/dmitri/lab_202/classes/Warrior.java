package com.dmitri.lab_202.classes;

public class Warrior extends Player{
    private int power;
    public Warrior(int id, int strength, int power) {
        super(id, strength);
        this.power = power;
    }
    public void launchAttack(){
        setPower(getPower()-10);
    }
    @Override
    public void attack(Player player){
        if(power>=10){
            launchAttack();
            player.setHealth(player.getHealth()-this.getStrength());
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}