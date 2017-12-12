package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameDraw extends JFrame implements MouseListener, MouseMotionListener {

    JPanel panel;
    Graphics graphic;

    public FrameDraw() {
        panel = new JPanel();
        addMouseListener(this);
        addMouseMotionListener(this);
        panel.setBackground(Color.white);

        this.add(panel);
    }

    public static void main(String[] args) {
        JFrame window = new FrameDraw();
        window.setSize(1300, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);
    }

    public void draw(String Shape, int PositionX, int PositionY, int Width, int Lenght, boolean fill, Color clr, boolean dragged) {
        graphic = panel.getGraphics();
        
        graphic.setColor(clr);
        switch (Shape) {
            case "rectangle":
                if (fill) {
                    graphic.fillRect(PositionX, PositionY, Width, Lenght);
                } else {
                    graphic.drawRect(PositionX, PositionY, Width, Lenght);
                }
                break;
            case "oval":
                if (fill) {
                    graphic.fillOval(PositionX, PositionY, Width, Lenght);
                }
                break;
        }
        graphic.dispose();
    }
    boolean hold = false;
    int positonX = 0;
    int positonY = 0;

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("click");
        draw("oval", me.getX() - 5, me.getY() - 36, 10, 10, true, Color.BLUE, false);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        hold = true;
        positonX = me.getX();
        positonY = me.getY();

    }

    @Override
    public void mouseReleased(MouseEvent me) {
        hold = false;
    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void mouseDragged(MouseEvent me) {
        System.out.println("dragged");
        if (hold) {
            draw("oval", positonX, positonY, me.getX() - positonX, me.getY() - positonY, true, Color.red, true);
        }

    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }

}
