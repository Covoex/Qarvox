package com.covoex.qarvox.Application;

import com.covoex.qarvox.Logic.GameCharacter;
import com.covoex.qarvox.Logic.World;

import java.util.Scanner;

import static com.covoex.qarvox.Application.BasicFunction.fiftyFifty;
import static com.covoex.qarvox.Application.BasicFunction.mainCharacter;
import static com.covoex.qarvox.Logic.CharacterInteraction.attack;

/**
 * The Input class handles user input.
 *
 * @author Myeongjun Kim
 *
 */

public class Input {
    public static Scanner s = new Scanner(System.in);

    public static void characterInput(GameCharacter character) {
        if (s.nextLine().equals("a")) {
            attack(mainCharacter, character);
        } else if (s.nextLine().equals("r")) {
            if (fiftyFifty()) {
                System.out.println("You failed to run");
                characterInput(character);
            }
        }
    }

    public static void worldInput(int input) {
        World world = new World(input);
        System.out.println();
        world.start();
    }

    public static void monsterInteract(String input, GameCharacter c1, GameCharacter c2) {
        if (input.matches("[Aa]")) {

        }
        if (input.matches("[Rr]")) {

        }
    }
}