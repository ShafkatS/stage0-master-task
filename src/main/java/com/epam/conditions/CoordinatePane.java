package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x > 0 && y > 0)
            System.out.println("First quadrant");

        else if (x < 0 && y > 0)
            System.out.println("Second quadrant");

        else if (x < 0 && y < 0)
            System.out.println("Third quadrant");

        else if (x > 0 && y < 0)
            System.out.println("Fourth quadrant");

        else
            System.out.println("Zero");
    }
    
    public static void main(String[] args) {
        CoordinatePane c = new CoordinatePane();
        c.printQuadrant(0,5);
    }

}

