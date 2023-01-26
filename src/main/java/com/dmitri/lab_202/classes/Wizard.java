package com.dmitri.lab_202.classes;

public class Wizard extends Player{
    private int magicLevel;

    public Wizard(int id, int strength, int magicLevel) {
        super(id, strength);
        this.magicLevel = magicLevel;
    }
    public void castSpell(){
        magicLevel = magicLevel-10;
    }
    @Override
    public void attack(Player player){
        if(magicLevel>=10){
            castSpell();
            player.setHealth(player.getHealth()-this.getStrength());
        }
    }

    public int getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(int magicLevel) {
        this.magicLevel = magicLevel;
    }
}
