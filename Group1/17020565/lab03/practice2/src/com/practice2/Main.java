package com.practice2;
import com.practice2.entity.*;

public class Main {

    public static void main(String[] args) {
        Fraction fraction = new Fraction(-6, 5);
        Fraction fraction2 = new Fraction(6,-5);
        System.out.println(fraction.equals(fraction2));
    }
}
