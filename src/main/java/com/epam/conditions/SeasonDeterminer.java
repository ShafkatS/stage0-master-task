package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (number == 1 || number ==2 || number ==12) {
            System.out.println("Winter");
        }
        else if (number == 3 || number == 4 || number == 5) {
            System.out.println("Spring");
        }
        else if (number == 6 || number == 7 || number == 8) {
            System.out.println("Summer");
        }
        else if (number == 9 || number == 10 || number == 11) {
            System.out.println("Autumn");
        }
        else System.out.println("Wrong month number");
    }


}
