import RPS.Paper;
import RPS.RPS;
import RPS.Rock;
import RPS.Scissors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

public class RPSGen extends JPanel implements MouseListener {

    private Dimension size = new Dimension(400,400); // diff btw private and protected
    private int max = 2; // max+1 is the num of possible rps
    private int min = 0;
    private RPS rps;

    public RPSGen(){
        setOpaque(false);
        setPreferredSize(size); // WHY NEED THIS? And why does setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); make such a huge diff?
        setMaximumSize(size); // WHY NEED THIS?
        setMinimumSize(size); // WHY NEED THIS?
        generateShape();
    }

    private void generateShape() {
        int r = getRandomNum();
        switch (r) {
            case 0:
                System.out.println("Rock");
                rps = new Rock(this.size);
                add(rps).addMouseListener(this);
                break;
            case 1:
                System.out.println("Paper");
                rps = new Paper(this.size);
                add(rps).addMouseListener(this);
                break;
            case 2:
                System.out.println("Scissors");
                rps = new Scissors(this.size);
                add(rps).addMouseListener(this);
                break;
        }
    }

    public int getRandomNum() {
        return (int) (Math.random() * ((max-min)+1) + min);
    }

    /**
     * Invoked when the mouse button has been clicked (pressed
     * and released) on a component.
     *
     * @param e
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        this.removeAll();
        revalidate(); // why need this?
        repaint(); // why need this?

//        JLabel counterLabel = new JLabel("3");
//        counterLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
//        add(counterLabel);
//        for(int x=3; x>0; x--) {
//            counterLabel.setText(Integer.toString(x-1));
//        }

        JLabel counterLabel = new JLabel("3"); // starts at 3
        counterLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        add(counterLabel);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println("test");
                int countDown = Integer.parseInt(counterLabel.getText());
                if (countDown != 0) {
                    countDown--;
                    counterLabel.setText(Integer.toString(countDown));
                } else {
                    generateShape();
                    timer.cancel();
                }
            }
        }, 0, 1000);

    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }

    /**
     * Invoked when a mouse button has been released on a component.
     *
     * @param e
     */
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invoked when the mouse enters a component.
     *
     * @param e
     */
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    /**
     * Invoked when the mouse exits a component.
     *
     * @param e
     */
    @Override
    public void mouseExited(MouseEvent e) {

    }
}
