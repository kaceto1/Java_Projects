package com.java24hours;

import java.io.IOException;
import java.nio.file.*;
import javax.swing.*;

public class FreeSpacePanel extends JPanel {
    JLabel spaceLabel = new JLabel("Disk space: ");
    JLabel space = new JLabel();
    
    public FreeSpacePanel() {
        super();
        add(spaceLabel);
        add(space);
        try {
            setValue();
        } catch (IOException ioe) {
            space.setText("Error");
        }
    }
    
    private final void setValue() throws IOException {
        //poluchavane na tekushtiq rezervoar za suhranenie na failove
        Path current = Paths.get("");
        FileStore store = Files.getFileStore(current);
        //otkrivane na praznoto prostranstvo za suhranenie
        long totalSpace = store.getTotalSpace();
        long freeSpace = store.getUsableSpace();
        //poluchavane na tazi stoinost kato procent (dvucifrena)
        double percent = (double)freeSpace / (double)totalSpace*100;
        percent = (int)(percent*100)/(double)100;
        //zadavane na teksta na etiketa
        space.setText(freeSpace + " free out of " + totalSpace + " (" 
                + percent + "%)");
    }
}
