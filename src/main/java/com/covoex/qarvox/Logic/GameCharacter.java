package com.covoex.qarvox.Logic;

import static com.covoex.qarvox.Application.BasicFunction.randomInt;
import static com.covoex.qarvox.Logic.Monster.getRandomMonster;
import static com.covoex.qarvox.Logic.Person.getRandomPerson;

/**
 * @author Myeongjun Kim
 */

public class GameCharacter {
    private String name;
    private double initialHealth;
    private double health;
    private double attackPower;
    private int level;
    private double exp;

    public GameCharacter() {
        setLevel(1);
    }

    public GameCharacter(String name) {
        setName(name);
        setLevel(1);
    }

    public GameCharacter(String name, int level) {
        setName(name);
        setLevel(level);
    }

    public static GameCharacter getRandomCharacter(int world) {
        if (randomInt() == -1) {
            return getRandomPerson(world);
        } else return getRandomMonster(world);
    }

    public String getType() {
        if (this instanceof Person) {
            return "Person";
        } else {
            return "Monster";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getAttackPower() {
        switch (level) {
            case 1:
                attackPower = 10;
                break;
            case 2:
        }
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getHealth() {
        switch (level) {
            case 1:
                health = 100;
                break;
        }
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public double getInitialHealth() {
        return initialHealth;
    }

    public void setInitialHealth(double initialHealth) {
        this.initialHealth = initialHealth;
    }
}