/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawdemo;

import java.awt.Color;

/**
 *
 * @author stephen
 */
public class ShapeMaker {
    public static Shape createRectangle(int x,int y,int w,int h, Color color){
        return new Rectangle(x,y,w,h,color);
    }
}
