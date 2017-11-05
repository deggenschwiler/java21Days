package com.java21days;

public class testExample {
    public static void main(String[] arguments){
        float x = 9;
        float y = 5;
        int z = (int)(x / y);
        switch (z) {
            case 1:
                x = x + 2;
        }


        System.out.println(x);
    }
}
