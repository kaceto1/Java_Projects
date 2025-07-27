package com.java24hours;

public class Modem {
    private int speed;
    
    public void displaySpeed() {
        System.out.println("Speed: " + getSpeed());
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
