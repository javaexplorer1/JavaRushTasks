package com.javarush.task.task24.task2413;

public class Stand extends BaseObject {

    private double speed;
    private double direction;

    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }


    @Override
    public void draw(Canvas canvas) {
        
    }

    @Override
    public void move() {
        this.x += this.direction * this.speed;
    }

    public void moveLeft() {
        this.direction = -1;
    }

    public void moveRight() {
        this.direction = 1;
    }
}
