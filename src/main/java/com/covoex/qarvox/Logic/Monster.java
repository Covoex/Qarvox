package com.covoex.qarvox.Logic;

/**
 * @author Myeongjun Kim
 */

public class Monster extends GameCharacter {
    public Monster(String name, int level) {
        setName(name);
        setLevel(level);
    }

    public static Monster getRandomMonster(int world) {
        return new Monster(getRandomName(), world);
    }
}
