package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint == 0) {
            for (int i = 1; i <= 10; i++) {
                int theResultOfTheZero = 0;
                System.out.println(i + " x " + numberTableToPrint + " = " + theResultOfTheZero);
            }
        } else {
            for (int i = 1; i <= 10; i++) {
                int theResultOfTheRestOfTheNumbers = i * numberTableToPrint;
                System.out.println(i + " x " + numberTableToPrint + " = " + theResultOfTheRestOfTheNumbers);
            }
        }
    }
 

}
