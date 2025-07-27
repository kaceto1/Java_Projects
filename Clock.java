package com.java24hours;

import java.time.*;
import java.time.temporal.*;

class Clock {
    public static void main(String[] arguments) {
        //получаване на текущи час и дата
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);
        
        //извеждане на поздрав
        if (hour < 12) {
            System.out.println("Good morning.\n");
        } 
        else if (hour < 17) {
            System.out.println("Good afternoon.\n");
        }
        else {
            System.out.println("Good evening.\n");
        }
        
        //започване на съобщение за час, като се показват минутите
        System.out.println("It's");
        if (minute != 0) {
            System.out.print(" " + minute + " ");
            if (minute != 1) {
                System.out.print("minutes");
            }
            else {
                System.out.print("minute");
            }
            System.out.print(" past");
        }
        
        //извеждане на числа
        System.out.print(" ");
        if (hour > 12) {
            System.out.print(hour - 12);
        }
            else {
            System.out.print(hour);
        }
        System.out.print(" o'clock on ");
        
        //извеждане на името на месеца
        switch (month) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("Juky");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
        }
        
        //извежда датата и годината
        System.out.println(" " + day + ", " + year + ".");
    }
}
