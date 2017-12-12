/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawdemo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JColorChooser;

/**
 *
 * @author stephen
 */
public class Paint extends javax.swing.JFrame implements MouseListener, MouseMotionListener {

    /**
     * Creates new form Paint
     */
    public Paint() {
        initComponents();
        // add mouse event
        draw = new Drawer(panelDraw);
        draw.setSize(width, length);//set default size
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDraw = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnShapeRectangle = new javax.swing.JButton();
        btnShapeCircle = new javax.swing.JButton();
        btnShapeColor = new javax.swing.JButton();
        edtShapeSizeWidth = new javax.swing.JTextField();
        cbxShapeFill = new javax.swing.JCheckBox();
        edtShapeSizeLenght = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDraw.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout panelDrawLayout = new javax.swing.GroupLayout(panelDraw);
        panelDraw.setLayout(panelDrawLayout);
        panelDrawLayout.setHorizontalGroup(
            panelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
        panelDrawLayout.setVerticalGroup(
            panelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        btnShapeRectangle.setText("Rectangle");
        btnShapeRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShapeRectangleActionPerformed(evt);
            }
        });

        btnShapeCircle.setText("Circle");
        btnShapeCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShapeCircleActionPerformed(evt);
            }
        });

        btnShapeColor.setText("Color");
        btnShapeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShapeColorActionPerformed(evt);
            }
        });

        edtShapeSizeWidth.setText("50");
        edtShapeSizeWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtShapeSizeWidthActionPerformed(evt);
            }
        });

        cbxShapeFill.setText("Fill");
        cbxShapeFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxShapeFillActionPerformed(evt);
            }
        });

        edtShapeSizeLenght.setText("50");
        edtShapeSizeLenght.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtShapeSizeLenghtActionPerformed(evt);
            }
        });

        jLabel1.setText("Width:");

        jLabel2.setText("Length:");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShapeColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtShapeSizeLenght, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtShapeSizeWidth)
                    .addComponent(btnShapeCircle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShapeRectangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxShapeFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShapeRectangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShapeCircle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxShapeFill)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtShapeSizeWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtShapeSizeLenght, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShapeColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShapeRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShapeRectangleActionPerformed
        //change shape type to rectangle 
        shapeType = "rectangle";
        drawShape(shapeFill);

    }//GEN-LAST:event_btnShapeRectangleActionPerformed

    private void btnShapeCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShapeCircleActionPerformed
        //change shape type to circle
        shapeType = "oval";

    }//GEN-LAST:event_btnShapeCircleActionPerformed

    private void cbxShapeFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxShapeFillActionPerformed
        //turn on shape fill if checkbox is selected
        shapeFill = cbxShapeFill.isSelected();
    }//GEN-LAST:event_cbxShapeFillActionPerformed

    private void edtShapeSizeWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtShapeSizeWidthActionPerformed
        //get with shape in ui
        width = Integer.parseInt(edtShapeSizeWidth.getText().toString().trim());
        draw.setWidth(width);
    }//GEN-LAST:event_edtShapeSizeWidthActionPerformed

    private void btnShapeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShapeColorActionPerformed
        //show dialog choose color and choose color
        shapeColor = JColorChooser.showDialog(this, "change color", shapeColor);
        draw.setColor(shapeColor);
    }//GEN-LAST:event_btnShapeColorActionPerformed

    private void edtShapeSizeLenghtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtShapeSizeLenghtActionPerformed
        //get shape lenght in ui
        
        length = Integer.parseInt(edtShapeSizeLenght.getText().toString().trim());
        draw.setLenght(length);
    }//GEN-LAST:event_edtShapeSizeLenghtActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //clear all shape int ui
        repaint();
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paint().setVisible(true);
            }
        });
    }

    Drawer draw;
    private String shapeType = "rectangle";
    private Color shapeColor = Color.BLACK;
    private int positionX = 0;
    private int positionY = 0;
    private int width = 50;
    private int length = 50;
    private boolean shapeFill = false;
    
    int idx = 0;

    private void drawShape(boolean fill) {
        switch(shapeType) {
            case "rectangle":
                if(fill){
                    draw.addShape(ShapeMaker.createRectangle(50*idx, 50*idx, 50, 50, Color.BLUE));
                    draw.draw();
                    idx++;
                }
                break;
            case "oval":
                if(fill){
                    draw.fillOval();
                    break;
                }
                draw.drawOval();
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnShapeCircle;
    private javax.swing.JButton btnShapeColor;
    private javax.swing.JButton btnShapeRectangle;
    private javax.swing.JCheckBox cbxShapeFill;
    private javax.swing.JTextField edtShapeSizeLenght;
    private javax.swing.JTextField edtShapeSizeWidth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelDraw;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent me) {
        positionX = me.getX() - width / 2;
        positionY = me.getY() - length / 2 - 30;
        draw.setPosition(positionX, positionY);
        drawShape(shapeFill);
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
