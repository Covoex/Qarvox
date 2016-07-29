package com.covoex.qarvox.Logic;

import static com.covoex.qarvox.Application.BasicFunction.printHealthGauge;

/**
 * @author Myeongjun Kim
 */

public class CharacterInteraction {

    public static void attack(GameCharacter c1, GameCharacter c2) {
        while (c2.getHealth() > 0) {
            if (c1.getHealth() <= 0) {
                System.out.println(c1.getName() + " is dead");
                return;
            }
            System.out.println("-----------------------------");
            System.out.println("level: " + c2.getLevel());
            System.out.println("name: " + c2.getName());
            printHealthGauge(c2);
            System.out.println("-----------------------------");
            c2.setHealth(c2.getHealth() - c1.getAttackPower());
        }
        System.out.println(c2.getName() + " is dead");
        if (c2 instanceof Person) {
            Person person = (Person) c2;
            System.out.println("You earned " + person.getMoney());
        }
    }

    public static void run() {

    }
}
