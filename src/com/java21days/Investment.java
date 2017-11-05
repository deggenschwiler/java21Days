package com.java21days;

public class Investment {

    public static void main(String[] arguments){
        double orginInvest = 14_000;
        double returnInvest = orginInvest * 1.4;
        returnInvest -= 1_500;
        returnInvest *= 1.12;
        int cleanreturn = ((int) returnInvest);

        System.out.println("Return from that original investment would be: $" + cleanreturn);
    }
}
