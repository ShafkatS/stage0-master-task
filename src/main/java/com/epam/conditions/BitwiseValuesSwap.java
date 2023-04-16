package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        first=first^second;
        second=first^second;
        first=first^second;
        System.out.println(first + " " + second);
    }
    
    public static void main(String[] args) {
        BitwiseValuesSwap b = new BitwiseValuesSwap();
        b.swap(1,5);
    }

}
