package RPS;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Paper extends RPS {

    public Paper(Dimension size) {
        initializePanel(size);
    }

    public void paintComponent(Graphics g) {
        Image paperImg = null;
        try {
            paperImg = ImageIO.read(new File("graphics/paper.png"));
        } catch (IOException e) {
            System.out.println("Error in loading paper image!");
            e.printStackTrace();
        }
        g.drawImage(paperImg, getWidth()/6,getHeight()/7,null);
    }
}
