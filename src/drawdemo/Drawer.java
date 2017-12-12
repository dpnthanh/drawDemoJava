package drawdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Drawer{
    
    //shape type
    Graphics graphic;
    int positionX = 0;
    int positionY = 0;
    int width = 0;
    int length = 0;
    int canvasWidth, canvasHeight;
    
    ArrayList<Shape> list = new ArrayList<Shape>();
            
    public Drawer(JPanel panelDraw){
       this(panelDraw,Color.RED);
    }
    
    public Drawer(JPanel panelDraw, Color Clr){
        this(panelDraw,Clr,0,0);
    }
    public Drawer(JPanel panelDraw, Color Clr, int PositionX, int PositionY){
        this(panelDraw,Clr,PositionX,PositionY,10,10);
    }
    
    public Drawer(JPanel panelDraw, Color Clr, int PositionX, int PositionY, int Width, int Lenght){
        createGraphic(panelDraw);
        canvasWidth = panelDraw.getWidth();
        canvasHeight = panelDraw.getHeight();
        setColor(Clr);
        setPosition(PositionX, PositionY);
        setSize(Width, Lenght);
    }
    
    public void createGraphic(JPanel panelDraw){
        graphic = panelDraw.getGraphics();
    }
    
    //set color for shape
    public boolean setColor(Color Clr){
        graphic.setColor(Clr);
        return true;
    }
    //set position for shape
    public boolean setPosition(int PositionX, int PositionY){
        this.positionX = PositionX;
        this.positionY = PositionY;
        return true;
    }
    //set positionX
    public void setPositionX(int PositionX) {
        positionX = PositionX;
    }
    //set positionY
    public void setPositiobY(int PositionY) {
        positionY = PositionY;
    }
    //set size for shape
    public boolean setSize(int Width, int Lenght){
        this.width = Width;
        this.length = Lenght;
        return true;
    }
    public void setWidth(int Width){
        this.width = Width;
    }
    public void setLenght(int Length){
        this.length = Length;
    }
    
    //call this function when draw anything done
    public void drawDone(){
        graphic.dispose();
    }
    
    public void clreaAll(){
        
    }
    
    public void addShape(Shape shape){
        this.list.add(shape);
    }
    
    public void draw(){
        graphic.clearRect(0, 0, this.canvasWidth, this.canvasHeight);
        for(int i=0;i<list.size();i++){
            Shape shape = list.get(i);
            shape.draw(graphic);
        }
    }
    
    //draw a rectangle
    public boolean drawRec(){
        graphic.drawRect(positionX, positionY, width, length);
        return true;
    }
    
    //draw a fill rectangle
    public boolean fillRec(){
        graphic.fillRect(positionX, positionY, width, length);
//        graphic.fillRect(100, 100, 100, 100);
        return true;
    }
    //draw a oval
    public boolean drawOval(){
        graphic.drawOval(positionX, positionY, width, length);
        return true;
    }
    //draw a fill oval
    public boolean fillOval(){
        graphic.fillOval(positionX, positionY, width, length);
        return true;
    }
    
    
}
