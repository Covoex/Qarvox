package com.covoex.qarvox.Logic;

import static com.covoex.qarvox.Application.BasicFunction.printHealthGauge;

/**
 * @author Myeongjun Kim
 */

public class CharacterInteraction {

    public static void attack(Person person, Monster monster) {
        while (monster.getHealth() > 0) {
            if (person.getHealth() <= 0) {
                System.out.println(person.getName() + " is dead");
                return;
            }
            System.out.println("-----------------------------");
            System.out.println("level: " + monster.getLevel());
            System.out.println("name: " + monster.getName());
            printHealthGauge(monster);
            System.out.println("-----------------------------");
            monster.setHealth(monster.getHealth() - person.getAttackPower());
        }
        System.out.println(monster.getName() + " is dead");
    }

    public static void attack(Person p1, Person p2) {

    }

    public static void run() {

    }
}
