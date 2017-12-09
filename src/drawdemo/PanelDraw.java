package drawdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDraw extends JPanel implements MouseListener, MouseMotionListener{
    
    JPanel panelDraw;
    
    public PanelDraw(){
        panelDraw = new test.PanelDraw();
        panelDraw.setSize(1000, 500);
        panelDraw.setBackground(Color.white);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public static void main(String[] args) {
        PanelDraw panel = new PanelDraw();
        JFrame jframe = new JFrame();
        jframe.setSize(1300, 700);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setBackground(Color.gray);
        jframe.add(panel.panelDraw);
        jframe.setVisible(true);
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("click");
        Graphics graphic = panelDraw.getGraphics();
        graphic.setColor(Color.yellow);
        graphic.fillOval(me.getX() - 10, me.getY() - 10, 20, 20);
        graphic.dispose();
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
}
