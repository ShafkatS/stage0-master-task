package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
       int s = 1;
        for (int i = 0; i < power; i++) {
            s*=numberToPrint;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
