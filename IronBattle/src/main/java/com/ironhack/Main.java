package com.ironhack;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Wizard character1 = createWizard("Gandalf");
        Warrior character2 = createWarrior("Heracles");

        startBattle(character1, character2);
    }

    public static Wizard createWizard(String name){
        int hp = ThreadLocalRandom.current().nextInt(50, 101);
        int mana = ThreadLocalRandom.current().nextInt(10, 51);
        int intelligence = ThreadLocalRandom.current().nextInt(1, 51);

        Wizard wizardCharacter = new Wizard(name, hp, mana, intelligence);
        System.out.println("A Wizard Character with " + hp + " HP, named " + wizardCharacter.getName() + ", with " + wizardCharacter.getMana() + " Mana and " + wizardCharacter.getIntelligence() + " Intelligence is created!");
        return wizardCharacter;
    }

    public static Warrior createWarrior(String name){
        int hp = ThreadLocalRandom.current().nextInt(100, 201);
        int stamina = ThreadLocalRandom.current().nextInt(10, 51);
        int strength = ThreadLocalRandom.current().nextInt(1, 11);

        Warrior warriorCharacter = new Warrior(name, hp, stamina, strength);
        System.out.println("A Warrior Character with " + hp + " HP, named " + warriorCharacter.getName() + ", with " + warriorCharacter.getStamina() + " Stamina and " + warriorCharacter.getStrengh() + " Strength is created!");
        return warriorCharacter;
    }

    public static void startBattle(Character character1, Character character2){
        System.out.println("=== BATTLE STARTED! ===");
        int rounds = 0;

        while(character1.getLifeStatus() && character2.getLifeStatus()){
            System.out.println("=== Round " + rounds + " ===");

            character1.attack(character2);
            character2.attack(character1);
            rounds++;
        }

        if(!character1.getLifeStatus() && !character2.getLifeStatus()){
            character1.resetStats();
            character2.resetStats();
            startBattle(character1, character2);
        }
        else {
            Character winner = character1.getLifeStatus() ? character1 : character2;
            System.out.println("The WINNER is : " + winner.getName());
            System.out.println("=== THE BATTLE IS OVER ===");
        }

    }

}