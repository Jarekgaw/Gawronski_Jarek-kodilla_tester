package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private double speed;
    private int decreaseSpeed;

    public Opel(double speed) {
      this.speed = speed;
     this.decreaseSpeed = decreaseSpeed;

    }

    public Opel(double speed, double i) {

    }

    @Override
    public double getSpeed() {
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
