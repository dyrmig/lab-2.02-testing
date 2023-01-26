package com.dmitri.lab_202.classes;

public abstract class Player {
    private int id;
    private int health;
    private int strength;
    private int lives;
    private boolean gameOver = false;

    public Player(int id, int strength) {
        this.id = id;
        this.health = 100;
        this.strength = strength;
        this.lives = 7;
    }

    public void playerDeath(){
        if(lives >= 1){
            lives = lives -1;
            health = 100;
        } else {
            gameOver = true;
        }
    }

    public void attack(Player player){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0){
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
