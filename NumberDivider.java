package com.java24hours;

public class NumberDivider {
    public static void main(String[] arguments) {
        int result;
        int i = 0;
        while(i < arguments.length) {
            try {    
                result = Integer.parseInt(arguments[i]) / Integer.parseInt(arguments[i+1]);
                System.out.println(arguments[i] + " divided by " + arguments[i+1]
                + " equals " + result);                      
                i = i + 2;
            } catch (NumberFormatException | ArithmeticException |
                ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
                i = i + 2;
            }    
        }
        System.out.println(i);
    }
}
