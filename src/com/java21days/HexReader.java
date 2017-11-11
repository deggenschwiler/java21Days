package com.java21days;

public class HexReader {
    String[] input = { "000A110D1D260219", "000A11AD1E2609", "25A110D1D260237"};

    public static void main(String[] arguments) {
        HexReader hex = new HexReader();
        for  (int i = 0; i < hex.input.length; i++) {
            hex.readLine(hex.input[i]);
        }
    }

    void readLine(String code) {
        try {
            for (int j = 0; j + 1 < code.length(); j += 2) {
                String sub = code.substring(j, j + 2);
                int num = Integer.parseInt(sub, 16);
                if (num == 255) {
                    return;
                }
                System.out.print(num + " ");
            }
        } finally {
            System.out.println("**");

        }
        return;
    }
}
