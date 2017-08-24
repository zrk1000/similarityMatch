package com.zrk1000.match;

/**
 * Created by rongkang on 2017-08-24.
 */
public class Point {

    private double x;
    private double y;
    private double width;
    private double height;

    public Point(double width, double height) {
        double y_square =  (Math.pow(width,2)*Math.pow(height,2))/(Math.pow(width,2)+Math.pow(height,2));
        double x_square =  (Math.pow(width,2)+Math.pow(height,2))/4 - y_square;
        this.y = Math.sqrt(y_square);
        this.x = Math.sqrt(x_square);
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
