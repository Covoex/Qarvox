package com.covoex.qarvox.Logic;

import static com.covoex.qarvox.Application.BasicFunction.randomInt;
import static com.covoex.qarvox.Application.Input.s;
import static com.covoex.qarvox.Logic.Monster.getRandomMonster;
import static com.covoex.qarvox.Logic.Person.getRandomPerson;

/**
 * @author Myeongjun Kim
 */

public class GameCharacter {
    private String name;
    private int level;
    private double initialHealth = level * 10 + 100;
    private double health = initialHealth;
    private double attackPower = level * 10 + 10;
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

    public String getHealthGauge(GameCharacter c) {
        String returnString = "";
        String addString = "";
        for (int i = 0; i < (c.getInitialHealth() - c.getHealth()); i++) {
            addString += " ";
        }
        for (int i = 0; i < c.getHealth(); i++) {
            returnString += '-';
        }
        return "[" + returnString + addString + "]";
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
        if (name.matches("[A-Za-z]")) {
            this.name = name;
        } else {
            System.out.print("Name can only contain the English Alphabet: ");
            setName(s.nextLine());
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getHealth() {
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