package ru.job4j.calculate.condition;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + (Math.pow(that.y - this.y, 2)));
    }


}
