package RPS;

import javax.swing.*;
import java.awt.*;

public abstract class RPS extends JPanel {

    public void initializePanel(Dimension size) {
        setOpaque(false);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);
    }

}
