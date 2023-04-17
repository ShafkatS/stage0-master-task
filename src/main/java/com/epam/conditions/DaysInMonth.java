package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(!(month>0 && month<13) || year < 0){
            System.out.println("invalid date");
        }
        boolean leapYear = false;
        if(year % 4 == 0){
            if(year % 100 ==0){
                if(year % 400 ==0){
                    leapYear = true;
                }
            }else{
                leapYear = true;
            }
        }
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
            case 4, 6, 9, 11 -> System.out.println("30");
            case 2 -> {
                if(leapYear){
                    System.out.println("29");
                }else {
                    System.out.println("28");
                }
            }
        }

    }

}
