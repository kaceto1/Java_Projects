 package com.java24hours;

import java.net.*;

public class HomePage {
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
