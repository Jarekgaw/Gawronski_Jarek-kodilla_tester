package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;
    private int decreaseSpeed;

    public Opel(int speed, int decreaseSpeed) {
      this.speed = speed;
      this.decreaseSpeed = decreaseSpeed;

    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        System.out.println("Opel" + speed);

    }
    @Override
    public void decreaseSpeed() {
        System.out.println("Opel" + decreaseSpeed);
    }
}
