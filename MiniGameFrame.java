package com.java24hours;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MiniGameFrame extends JFrame implements KeyListener {
    
    JLabel label;
    ImageIcon image;
    
    public MiniGameFrame() {
        super("My Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);
        addKeyListener(this);
        
        image = new ImageIcon("C:\\Users\\Kamen\\Documents\\NetBeansProjects\\Java24\\src\\com\\java24hours\\rocket.png");
        
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        label.setIcon(image);
        
        getContentPane().setBackground(Color.black);
        add(label);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd':
                label.setLocation(label.getX()+10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 39:
                label.setLocation(label.getX()+10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY()+10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyChar()=='?') {
            System.out.println(e.getKeyCode());
        }
        else {
            System.out.println(e.getKeyChar());
        }
    }
}

