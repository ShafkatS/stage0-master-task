package com.epam.langSyntax;

public class NumberReverter {
    int value = 0;

    public void revert(int number) {
        while (number != 0) {
            int expected = number % 10;
            value = value * 10 + expected;
            number /= 10;
        }
        System.out.println(value);
    }
    public static void main(String[] args) {
        NumberReverter n = new NumberReverter();
        n.reverter(123456789);
    }

}
