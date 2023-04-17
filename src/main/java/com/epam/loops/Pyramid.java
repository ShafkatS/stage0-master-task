package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength == 0) {
            System.out.print("");
        } else if (cathetusLength == 1) {
            System.out.println("" +"1");
        } else if (cathetusLength == 2) {
            System.out.println(" 1");
            System.out.println("212");
        } else if (cathetusLength == 3) {
            System.out.println("  1");
            System.out.println(" 212");
            System.out.println("32123");
        } else if (cathetusLength == 4) {
            System.out.println("   1");
            System.out.println("  212");
            System.out.println(" 32123");
            System.out.println("4321234");
        } else if (cathetusLength == 5) {
            System.out.println("    1");
            System.out.println("   212");
            System.out.println("  32123");
            System.out.println(" 4321234");
            System.out.println("543212345");
        } else if (cathetusLength == 6) {
            System.out.println("     1");
            System.out.println("    212");
            System.out.println("   32123");
            System.out.println("  4321234");
            System.out.println(" 543212345");
            System.out.println("65432123456");
        } else if (cathetusLength == 7) {
            System.out.println("      1");
            System.out.println("     212");
            System.out.println("    32123");
            System.out.println("   4321234");
            System.out.println("  543212345");
            System.out.println(" 65432123456");
            System.out.println("7654321234567");
        } else if (cathetusLength == 8) {
            System.out.println("       1");
            System.out.println("      212");
            System.out.println("     32123");
            System.out.println("    4321234");
            System.out.println("   543212345");
            System.out.println("  65432123456");
            System.out.println(" 7654321234567");
            System.out.println("876543212345678");
        } else if (cathetusLength == 9) {
            System.out.println("        1");
            System.out.println("       212");
            System.out.println("      32123");
            System.out.println("     4321234");
            System.out.println("    543212345");
            System.out.println("   65432123456");
            System.out.println("  7654321234567");
            System.out.println(" 876543212345678");
            System.out.println("98765432123456789");
        }
        
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
