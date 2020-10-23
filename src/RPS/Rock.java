package RPS;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Rock extends RPS {

    public Rock(Dimension size) {
        initializePanel(size);
    }

    public void paintComponent(Graphics g) {
        Image rockImg = null;
        try {
            rockImg = ImageIO.read(new File("graphics/rock.png"));
        } catch (IOException e) {
            System.out.println("Error in loading rock image!");
            e.printStackTrace();
        }
        g.drawImage(rockImg, getWidth()/5,getHeight()/5,null);
    }
}
