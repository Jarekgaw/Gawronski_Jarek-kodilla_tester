package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
  private int speed;
  private int decreaseSpeed;

  public Ford(int speed, int decreaseSpeed) {
    this.speed = speed;
    this.decreaseSpeed = decreaseSpeed;
  }
  @Override
  public int getSpeed(){
    return speed;
  }

  @Override
    public void increaseSpeed() {

    System.out.println("Ford" + getSpeed());
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Ford" + decreaseSpeed);
    }
}
