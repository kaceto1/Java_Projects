package com.java24hours;

import java.awt.*;
import javax.swing.*;

public class SalutonFrame extends JFrame {
    public SalutonFrame() {
        super("Saluton Mondo!");
        setLookAndFeel();
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JTextArea comments = new JTextArea("Saluton Mondo!",1,10);
        add(comments);
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "javax.swing.nimbus.NimbusLookAndFeel"
            );
        } catch (final Exception exc) {
            //ignorira greshkata
        }
    }
    
    public static void main(String[] arguments) {
        SalutonFrame frame = new SalutonFrame();
    }
}
