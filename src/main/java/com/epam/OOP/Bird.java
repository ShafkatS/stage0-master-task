package com.epam.OOP;

public class Bird extends Animal {
   public Bird() {
    }
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }
  
   @Override
    public String getDescription() {
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and no fur" + ". Moreover, it has 2 wings and can fly";
    }

}
