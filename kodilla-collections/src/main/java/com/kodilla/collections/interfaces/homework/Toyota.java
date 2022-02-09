package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car{
   private int speed;
   private int decreaseSpeed;


   public Toyota(int speed, int decreaseSpeed) {
        this.speed = speed;
        this.decreaseSpeed = decreaseSpeed;

    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Toyota" + speed);

    }

    @Override
   public void decreaseSpeed() {
       System.out.println("Toyota" + decreaseSpeed);

    }
}
