package com.java24hours;

import java.util.*;

class NameSorter {
    public static void main(String[] arguments) {
        String[] names = { "Glimmer", "Marvel", "Rue", "Clove",
        "Thresh", "Foxface", "Cato", "Peeta", "Katniss" };
        System.out.println("The original order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
        
        //методът променя низа, като го сортира по възходящ ред
        Arrays.sort(names);
        
        System.out.println("The new order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
    }
}
