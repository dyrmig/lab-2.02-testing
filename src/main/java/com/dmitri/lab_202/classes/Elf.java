package com.dmitri.lab_202.classes;

public class Elf extends Player{
    private int amountArrows;

    public Elf(int id,int strength, int amountArrows) {
        super(id, strength);
        this.amountArrows = amountArrows;
    }
    public void shootArrow(){
        amountArrows = amountArrows-1;
    }
    @Override
    public void attack(Player player){
        if(amountArrows>=1){
            shootArrow();
            player.setHealth(player.getHealth()-this.getStrength());
        }
    }

    public int getAmountArrows() {
        return amountArrows;
    }

    public void setAmountArrows(int amountArrows) {
        this.amountArrows = amountArrows;
    }
}
