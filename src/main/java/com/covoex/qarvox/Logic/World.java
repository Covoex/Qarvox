package com.covoex.qarvox.Logic;

import static com.covoex.qarvox.Application.Input.characterInput;
import static com.covoex.qarvox.Logic.GameCharacter.getRandomCharacter;

/**
 * @author Myeongjun Kim
 */

public class World {
    private int worldNum;

    public World(int worldNum) {
        this.worldNum = worldNum;
    }

    public int getWorldNum() {
        return worldNum;
    }

    public void start() {
        System.out.println();
        System.out.println("You are at World" + worldNum);
        for (int i = 0; i < 5; i++) {
            GameCharacter gameCharacter = getRandomCharacter(worldNum);
            System.out.println("There is a " + "[" + gameCharacter.getType() + "] "
                    + gameCharacter.getName());
            characterInput(gameCharacter);
        }
    }
}
