package com.epam.langSyntax;

public class DigitsSumCalculator {
     int sum = 0;
     int value;

    public void calculateSum(int number) {
        value = number % 10;
        sum = sum + value;
        number = number / 10;
        value = number % 10;
        sum = sum + value;
        number = number / 10;
        sum = sum + number;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        DigitsSumCalculator d = new DigitsSumCalculator();
        d.calculatorSum(111);
    }

}
