package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        try {
            int a = dividend / divider;
            if (a * divider == dividend) {
                System.out.println("can be divided completely");
            } else if (a * divider != dividend || a * divider == 0) {
                System.out.println("cannot be divided completely");
            }
        } catch (Exception e) {
            System.out.println("division by zero");
        }
    }
    public static void main(String[] args) {
        IntegerDivider t4 = new IntegerDivider();
        t4.printCompletelyDivided(10,0);
    }

}
