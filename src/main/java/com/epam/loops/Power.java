package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        
         double result =1;
        int i;

        for(i = power; i >0; i--)
        {
            result *= numberToPrint;
        }
        System.out.println(numberToPrint + " in power " + power + " = " + result);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
