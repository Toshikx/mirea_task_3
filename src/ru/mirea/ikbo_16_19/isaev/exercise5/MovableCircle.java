package ru.mirea.ikbo_16_19.isaev.exercise5;

public class MovableCircle extends Circle implements Movable{

    public MovableCircle(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    public void move(int x, int y) {
        this.setxPos(getxPos()+x);
        this.setyPos(getyPos()+y);
    }
}
