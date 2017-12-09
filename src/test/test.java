package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class test extends JFrame {

    //set width height for window frame
    private static int windowWidth = 700;
    private static int windowHeight = 500;

    private static JFrame windowFrame;
    private JPanel panel;
    int x, y;
    int r,g,b;
    Color clr;
    Random ra = new Random();

    private test() {
        panel = new JPanel();
        panel.setBackground(Color.white);
        JButton btnAddRectangle = new JButton("Draw Rec");
        btnAddRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                for (int i = 0; i < 10000; i++) {
                    r = ra.nextInt(255);
                    g = ra.nextInt(255);
                    b = ra.nextInt(255);
                    clr = new Color(r,g,b);
                    x = (int) (panel.getWidth() * Math.random());
                    y = (int) (panel.getHeight() * Math.random());
                    Graphics g = panel.getGraphics();
                    g.setColor(clr);
                    g.drawRect(x, y, 50, 50);
                    g.dispose();
                }
            }
        });
        add(panel);
        add(btnAddRectangle, BorderLayout.NORTH);

    }

    public static void main(String[] args) {
        windowFrame = new test();
        windowFrame.setSize(windowWidth, windowHeight);
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setBackground(Color.gray);

        windowFrame.setVisible(true);
    }
}
