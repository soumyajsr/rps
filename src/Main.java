import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame{

    private RPSGen rpsGen = new RPSGen(); // diff btw initializing here vs in main?

    private Main() {
        super("Rock, Paper, Scissors"); // why super and not "this"?
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // does it make a diff if I do "this."
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setIconImageHelper();
        setContentPaneHelper();
        pack();
        setVisible(true);
    }

    private void setContentPaneHelper() {
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        add(rpsGen);
    }

    private void setIconImageHelper() {
        BufferedImage icon = null;
        try {
            icon = ImageIO.read(new File("graphics/rock.png"));
        } catch (IOException e) {
            System.out.print("Error in setting icon!");
        }
        setIconImage(icon);
    }

    public static void main(String[] args) {
        new Main();
    }
}
