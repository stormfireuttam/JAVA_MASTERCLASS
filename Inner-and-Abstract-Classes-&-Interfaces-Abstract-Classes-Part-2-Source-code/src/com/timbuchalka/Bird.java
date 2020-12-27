package com.timbuchalka;

/**
 * Created by dev on 7/10/2015.
 */
public class Bird extends Animal implements CanFly
{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }

    @Override
    public void peck() {
        System.out.println(getName() + " is pecking.");
    }
}
