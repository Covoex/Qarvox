package com.covoex.qarvox.Logic;

import static com.covoex.qarvox.Application.BasicFunction.getRandomString;
import static com.covoex.qarvox.Application.BasicFunction.randomInt;
import static com.covoex.qarvox.Application.Input.monsterInput;

/**
 * @author Myeongjun Kim
 */

public class World {
    private int worldNum;

    public World(int worldNum) {
        this.worldNum = worldNum;
    }

    public static Monster getRandomMonster(int worldNum) {
        return new Monster(getRandomString(), worldNum + randomInt());
    }

    public void start() {
        System.out.println("You are at World" + this.worldNum);
        for (int i = 0; i < 5; i++) {
            Monster randomMonster = getRandomMonster(this.worldNum);
            System.out.println("There is a " + randomMonster.getName());
            monsterInput(randomMonster);
        }
    }
}
