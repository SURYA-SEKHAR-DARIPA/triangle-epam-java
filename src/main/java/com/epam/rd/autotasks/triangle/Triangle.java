package com.epam.rd.autotasks.triangle;
import java.util.*;

class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;

         if ((first == null) || (second == null) || (third == null))
            throw new RuntimeException();

      if (area() == 0) {
            throw new RuntimeException();
        }
    }

    public double area() {
        double x1 = first.getX();
        double x2 = second.getX();
        double x3 = third.getX();
        double y1 = first.getY();
        double y2 = second.getY();
        double y3 = third.getY();
        
        return Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
    }

    public Point centroid(){

        double centerY = (1 / 3.) * (first.getY() + second.getY() + third.getY());
        double centerX = (1 / 3.) * (first.getX() + second.getX() + third.getX());

        return new Point(centerX, centerY);
    }

}
