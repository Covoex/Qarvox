package com.covoex.qarvox.Logic;

import static com.covoex.qarvox.Application.BasicFunction.getRandomString;
import static com.covoex.qarvox.Application.BasicFunction.randomInt;

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
        return new Person(getRandomString(), world + randomInt());
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
