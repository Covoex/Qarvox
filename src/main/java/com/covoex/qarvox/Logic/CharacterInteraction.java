package com.covoex.qarvox.Logic;

/**
 * @author Myeongjun Kim
 */

public class CharacterInteraction {

    public static void attack(GameCharacter c1, GameCharacter c2) {
        System.out.println();
        System.out.println("level: " + c2.getLevel());
        System.out.println("name: " + c2.getName());
        System.out.println("Health: " + c2.getHealthGauge(c2));
        System.out.println();
        c2.setHealth(c2.getHealth() - c1.getAttackPower());
    }

    public static void run() {

    }
}
