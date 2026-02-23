package com.ironhack;
import java.util.UUID;

public abstract class Character {
    private final String id = UUID.randomUUID().toString();
    private String name;
    private int hp;
    private boolean isAlive = true;

    public Character(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    //getters
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public boolean getLifeStatus(){
        return this.isAlive;
    }

    //setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setHp(int newHp){
        this.hp = newHp;
    }
    public void setLifeStatus(boolean newLifeStatus){
        this.isAlive = newLifeStatus;
    }

}
