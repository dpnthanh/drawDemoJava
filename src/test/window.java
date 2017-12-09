/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author stephen
 */
public class window extends JFrame {

    int width = 1300;
    int height = 700;
    JPanel panelDraw;

    public window() {
        panelDraw = new PanelDraw(1000, 500);
        JFrame jframe = new window();
        jframe.setSize(width, height);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(panelDraw);
        jframe.setVisible(true);
    }

}
