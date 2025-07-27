package com.java24hours;

import java.net.*;

public class Catalog {
    class HomePage {
        String owner;
        URL adress;
        String category = "none";
    
        public HomePage (String inOwner, String inAdress) throws MalformedURLException {
            owner = inOwner;
            adress = new URL(inAdress);
        }    
    
        public HomePage (String inOwner, String inAdress, String inCategory) throws MalformedURLException {
            this(inOwner, inAdress);
            category = inCategory;
        }
    }
    
    public Catalog() {
        Catalog.HomePage[] catalog = new Catalog.HomePage[5];
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
    
    public static void main(String[] arguments) {
        new Catalog();
    }
}
