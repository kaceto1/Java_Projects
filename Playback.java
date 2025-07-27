package com.java24hours;

import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame {
    public Playback() {
        super("Playback");
        setLookAndFeel();
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton play = new JButton("PLAY");
        add(play);
        JButton stop = new JButton("STOP");
        add(stop);
        JButton pause = new JButton("PAUSE");
        add(pause);
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (final Exception exc) {
            //ignorirane na greshkata
        }
    }
    
    public static void main(String[] arguments) {
        Playback frame = new Playback();
    }
}
