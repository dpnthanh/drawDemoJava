/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author stephen
 */
public class PanelDraw extends JPanel implements MouseListener, MouseMotionListener{
    
    Graphics graphic;
    public PanelDraw(){
        
    }
    public PanelDraw(int Width, int Lenght){
        JPanel panelDraw = new PanelDraw();
        JFrame window = new JFrame();
        window.setSize(1300, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(Color.white);
        window.add(panelDraw);
        
        panelDraw.setSize(Width, Lenght);
        panelDraw.setBackground(Color.yellow);
        addMouseListener(this);
        addMouseMotionListener(this);
        graphic = panelDraw.getGraphics();
    }

    public void draw(String Shape, int PositionX, int PositionY, int Width, int Lenght, boolean fill, Color clr){
        graphic.setColor(Color.BLACK);
        switch(Shape){
            case "rectangle":
                if (fill) {
                    graphic.fillRect(PositionX, PositionY, Width, Lenght);
                } else {
                    graphic.drawRect(PositionX, PositionY, Width, Lenght);
                }
                break;
        }
        graphic.dispose();
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        draw("rectangle", me.getX()-50, me.getY()-50, 100, 100, true, Color.red);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        
    }
    public static void main(String[] args) {
        PanelDraw win = new PanelDraw();
        win.setVisible(true);
    }
    
    
}
