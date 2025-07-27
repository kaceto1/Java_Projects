package com.java24hours;

import java.net.*;

public class PageCatalog {
    public static void main(String[] arguments) {
        HomePage[] catalog = new HomePage[5];
        try {
            catalog[0] = new HomePage("Mike Glyer", 
                "http://www.file770.com", "science fiction");
            catalog[1] = new HomePage("Shelly Powers", 
                "http://burningbird.net", "environments");
            catalog[2] = new HomePage("Rogers Cadenhead",
                "http://workbench.cadenhead.org", "programming");
            catalog[3] = new HomePage("Taegan Goddard", 
                "https://politicalwire.com", "politics");
            catalog[4] = new HomePage("Manton Reese", 
                "http://www.manton.org");
            int i = 0;
            while (i < catalog.length) {
                System.out.println(catalog[i].owner + ": " +
                    catalog[i].adress + " -- " +
                    catalog[i].category);
                i++;
            }
        } catch (MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
