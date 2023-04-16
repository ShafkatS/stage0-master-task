package com.epam.langSyntax;

public class DigitsSumCalculator {
   

    public void calculateSum(int number) {
        int sum = 0;
        int value;
        value = number % 10;
        sum = sum + value;
        number = number / 10;
        value = number % 10;
        sum = sum + value;
        number = number / 10;
        sum = sum + number;
        System.out.println(sum);
    }


}
