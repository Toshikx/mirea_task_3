package ru.mirea.ikbo_16_19.isaev.exercise5;

public class MovePoint extends Point implements Movable {

    public MovePoint(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+x);
    }
}
