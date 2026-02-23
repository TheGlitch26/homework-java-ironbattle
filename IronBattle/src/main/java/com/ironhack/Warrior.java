package com.ironhack;
import java.util.concurrent.ThreadLocalRandom;

public class Warrior extends Character implements Attacker {
    private int stamina = ThreadLocalRandom.current().nextInt(10, 51);
    private int strengh = ThreadLocalRandom.current().nextInt(1, 11);

    public Warrior(String name, int hp, int stamina, int strengh){
        super(name, hp);
    }
}
