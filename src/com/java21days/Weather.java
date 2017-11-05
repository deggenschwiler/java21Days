package com.java21days;

import java.util.Scanner;

public class Weather {

    public static void main(String[] arguments){
        float fah = 60;
        System.out.println(fah + " degrees Farenheit is...");
        //conv farenheit to celsius
        // sub 32
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " degrees Celsius");

        float cel = 15;
        System.out.println(cel + " degrees Celsius is...");
        //go back
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;
        System.out.println(cel + " degrees Farenheit");

    }
}
