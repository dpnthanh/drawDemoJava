/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawdemo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author stephen
 */
public class Rectangle extends Shape {
    
    public Rectangle(int x,int y,int w,int h,Color color){
        super(x,y,w,h,color);
    }

    @Override
    public void draw(Graphics gr) {
        gr.setColor(this.getColor());
        gr.drawRect(this.getX(), this.getY(), this.getW(), this.getH());
    }
    
}
