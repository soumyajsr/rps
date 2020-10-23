package RPS;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Scissors extends RPS {

    public Scissors(Dimension size) {
        initializePanel(size);
    }

    public void paintComponent(Graphics g) {
        Image scissorsImg = null;
        try {
            scissorsImg = ImageIO.read(new File("graphics/scissors.png"));
        } catch (IOException e) {
            System.out.println("Error in loading scissors image!");
            e.printStackTrace();
        }
        g.drawImage(scissorsImg, getWidth()/5,getHeight()/5,null);
    }
}
