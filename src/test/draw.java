package test;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class draw extends Canvas implements MouseListener, MouseMotionListener {

    JPanel panel;
    JFrame windowFrame;
    String event = "notthing";
    Random ra = new Random();
    int coR, coG, coB;
    Color clr;

    int widthWindow = 700;
    int heightWindow = 500;
    
    // rectangle, circle, triangular 
    String shape;
    int positionX = 0;
    int positionY = 0;
    ArrayList<Graphics> listShape = new ArrayList<>();

    public draw() {
        super();
        windowFrame = new JFrame(); // create form
        windowFrame.setSize(widthWindow, heightWindow); // set size for form
        windowFrame.setBackground(Color.gray);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setVisible(true);
        panel = new JPanel();
        windowFrame.add(panel);
        windowFrame.add(this);
        setVisible(true);
        Color clr = Color.white;
        setBackground(clr);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        int listShapeSize = listShape.size();
        for(int i = 0; i < listShapeSize; i++){
            listShape.get(i);
        }
        g.setColor(Color.BLACK);
        g.fillOval(positionX, positionY, 100, 100);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("clicked");
        positionX = me.getX() - 50;
        positionY = me.getY() - 50;
        Graphics g = panel.getGraphics();
        g.setColor(Color.yellow);
        g.fillOval(positionX, positionY, 100, 100);
        listShape.add(g);
        g.dispose();
    }

    @Override
    public void mousePressed(MouseEvent me) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("press");
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("released");
    }
    

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("entered");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("exited");
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        System.out.println("dragged");
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        System.out.println("moved");
//        positionX = me.getX() - 50;
//        positionY = me.getY() - 50;
//        repaint();
    }

}
