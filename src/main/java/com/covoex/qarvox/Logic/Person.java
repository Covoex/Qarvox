package com.covoex.qarvox.Logic;

import static com.covoex.qarvox.Application.BasicFunction.getRandomInt;

/**
 * @author Myeongjun Kim
 */

public class Person extends GameCharacter {
    private double money;

    public Person() {

    }

    public Person(String name, int level) {
        setName(name);
        setLevel(level);
    }

    public static Person getRandomPerson(int world) {
        return new Person(getRandomName(), world + getRandomInt());
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
