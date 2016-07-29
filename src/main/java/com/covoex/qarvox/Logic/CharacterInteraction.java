package com.covoex.qarvox.Logic;

/**
 * @author Myeongjun Kim
 */

public class CharacterInteraction {

    public static void attack(GameCharacter c1, GameCharacter c2) {
        if (c1.getHealth() <= 0) {
            System.out.println(c1.getName() + " is dead");
            if (c2 instanceof Person) {
                Person person = (Person) c2;
                System.out.println("You earned " + person.getMoney());
            }
            return;
        }
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
