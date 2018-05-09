/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptronv2;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author mcotrina
 */
public class Graficar extends Canvas{
    JFrame frame;

    public Graficar()
    {
        super();
        super.setSize(400,400);
        frame = new JFrame("Grafica de Modelo de red");
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);

    }
    public void agregarLineas(int a, int b, int c, int d){
        
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(1,1,500,500);
    }
}
